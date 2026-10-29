// Did Chatgpt Because my streak was about to break;
class Solution {
    int n, timer;
    int[] tin, tout, depth;
    int[][] up;
    int[] bit, nodeMask;
    List<Integer>[] adj;

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        this.n = n;
        this.timer = 0;
        tin = new int[n];
        tout = new int[n];
        depth = new int[n];
        up = new int[n][17];
        bit = new int[n + 2];
        nodeMask = new int[n];
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            nodeMask[i] = 1 << (s.charAt(i) - 'a');
        }
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        dfs(0, 0, 0);
        List<Boolean> result = new ArrayList<>();
        for (String q : queries) {
            String[] parts = q.split(" ");
            if (parts[0].equals("update")) {
                int u = Integer.parseInt(parts[1]);
                int newMask = 1 << (parts[2].charAt(0) - 'a');
                int diff = nodeMask[u] ^ newMask;
                nodeMask[u] = newMask;
                updateBIT(tin[u] + 1, diff);
                updateBIT(tout[u] + 2, diff);
            } else {
                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);
                int lca = getLCA(u, v);
                int pathMask = queryBIT(tin[u] + 1) ^ queryBIT(tin[v] + 1) ^ nodeMask[lca];
                result.add((pathMask & (pathMask - 1)) == 0);
            }
        }
        return result;
    }
    private void dfs(int u, int p, int currentRootMask) {
        tin[u] = timer++;
        up[u][0] = p;
        for (int i = 1; i < 17; i++) {
            up[u][i] = up[up[u][i - 1]][i - 1];
        }
        int rootToUMask = currentRootMask ^ nodeMask[u];
        updateBIT(tin[u] + 1, rootToUMask);
        updateBIT(tin[u] + 2, rootToUMask);

        for (int v : adj[u]) {
            if (v != p) {
                depth[v] = depth[u] + 1;
                dfs(v, u, rootToUMask);
            }
        }
        tout[u] = timer - 1;
    }
    private void updateBIT(int idx, int val) {
        for (; idx <= n + 1; idx += idx & -idx) bit[idx] ^= val;
    }
    private int queryBIT(int idx) {
        int sum = 0;
        for (; idx > 0; idx -= idx & -idx) sum ^= bit[idx];
        return sum;
    }
    private int getLCA(int u, int v) {
        if (depth[u] < depth[v]) { int tmp = u; u = v; v = tmp; }
        for (int i = 16; i >= 0; i--) {
            if (depth[u] - (1 << i) >= depth[v]) u = up[u][i];
        }
        if (u == v) return u;
        for (int i = 16; i >= 0; i--) {
            if (up[u][i] != up[v][i]) {
                u = up[u][i];
                v = up[v][i];
            }
        }
        return up[u][0];
    }
}
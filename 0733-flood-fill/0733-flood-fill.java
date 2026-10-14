class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            color(image, sr, sc, image[sr][sc], color);
        }
        return image;
    }

    public void color(int[][] image, int i, int j, int oldcolor, int newcolor) {
        image[i][j] = newcolor;
        
        if (i >= 1 && image[i - 1][j] == oldcolor) {
            color(image, i - 1, j, oldcolor, newcolor);
        }
        if (j >= 1 && image[i][j - 1] == oldcolor) {
            color(image, i, j - 1, oldcolor, newcolor);
        }
        if (i + 1 < image.length && image[i + 1][j] == oldcolor) {
            color(image, i + 1, j, oldcolor, newcolor);
        }
        if (j + 1 < image[0].length && image[i][j + 1] == oldcolor) {
            color(image, i, j + 1, oldcolor, newcolor);
        }
    }
}
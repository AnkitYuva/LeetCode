/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void dfs(struct TreeNode* node,int* sum){
    if(node == NULL){
        return;
    }
    if(node->left != NULL){
        if(node->left->left == NULL && node->left->right == NULL){
            *sum += node->left->val;
        }else{
            dfs(node->left,sum);
        }
    }
    dfs(node->right,sum);
}
int sumOfLeftLeaves(struct TreeNode* root) {
    int sum = 0;
    dfs(root,&sum);
    return sum;
}

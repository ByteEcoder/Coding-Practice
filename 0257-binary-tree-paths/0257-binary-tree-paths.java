/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();
        if (root == null) return res;
     
        dfs(root, String.valueOf(root.val), res);
        return res;
    }

    public void dfs(TreeNode node, String currentPath, List<String> res) {
        
        if (node.left == null && node.right == null) {
            res.add(currentPath);
            return;
        }

       
        if (node.left != null) {
            dfs(node.left, currentPath + "->" + node.left.val, res);
        }

        if (node.right != null) {
            dfs(node.right, currentPath + "->" + node.right.val, res);
        }
    }
}

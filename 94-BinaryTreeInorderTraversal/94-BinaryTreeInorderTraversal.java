// Last updated: 11/08/2026, 16:19:29
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    // List to store the inorder traversal result
    List<Integer> l = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return l;
    }

    // Move the helper method outside of inorderTraversal
    // Change 'Node' to 'TreeNode' to match LeetCode's definition
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);       // Traverse left subtree
        l.add(root.val);          // Add current node's value to the list
        inorder(root.right);      // Traverse right subtree
    }
}
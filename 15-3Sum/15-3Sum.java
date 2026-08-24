// Last updated: 24/08/2026, 12:15:22
1class Solution {
2    public List<Integer> postorderTraversal(TreeNode root) {
3        List<Integer> result = new ArrayList<>();
4        traverse(root, result);
5        return result;
6    }
7
8    private void traverse(TreeNode node, List<Integer> result) {
9        if (node == null) return;
10        
11        traverse(node.left, result);   // Left
12        traverse(node.right, result);  // Right
13        result.add(node.val);          // Root
14    }
15}
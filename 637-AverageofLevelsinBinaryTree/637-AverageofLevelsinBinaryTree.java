// Last updated: 31/08/2026, 09:39:31
1class Solution {
2    public TreeNode invertTree(TreeNode root) {
3        if (root == null) {
4            return null;
5        }
6
7        
8        TreeNode temp = root.left;
9        root.left = root.right;
10        root.right = temp;
11
12        
13        invertTree(root.left);
14        invertTree(root.right);
15
16        return root;
17    }
18}
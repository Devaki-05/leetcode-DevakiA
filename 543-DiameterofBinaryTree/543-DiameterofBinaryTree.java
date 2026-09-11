// Last updated: 11/09/2026, 09:03:43
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int maxDiameter =0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        getHeight(root);
20        return maxDiameter;
21    }
22    private int getHeight(TreeNode node){
23        if(node==null){
24            return 0;
25        }
26        int leftHeight = getHeight(node.left);
27        int rightHeight =getHeight(node.right);
28
29        maxDiameter =Math.max(maxDiameter,leftHeight+rightHeight);
30
31        return 1+Math.max(leftHeight,rightHeight);
32    }
33}
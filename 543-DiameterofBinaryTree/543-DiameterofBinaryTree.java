// Last updated: 11/09/2026, 09:04:34
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
17    public boolean isSymmetric(TreeNode root) {
18        if(root == null){
19            return true;
20        }
21        return isMirror(root.left,root.right);
22    }
23    private boolean isMirror(TreeNode t1,TreeNode t2){
24        if(t1 == null && t2 == null){
25            return true;
26        }
27        if(t1 == null || t2 == null || t1.val != t2.val){
28            return false;
29        }
30        return isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
31    }
32}
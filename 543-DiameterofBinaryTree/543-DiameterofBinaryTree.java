// Last updated: 11/09/2026, 09:18:41
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
17    public List<String> binaryTreePaths(TreeNode root) {
18        List<String>paths = new ArrayList<>();
19        if(root != null) {
20            constructPaths(root,"",paths);
21        }
22        return paths;
23           }
24           private void constructPaths(TreeNode node,String path,List<String> paths){
25            if(node == null) return;
26            path +=Integer.toString(node.val);
27            if(node.left == null && node.right == null){
28                paths.add(path);
29            }else{
30                path +="->";
31                constructPaths(node.left,path,paths);
32                constructPaths(node.right,path,paths);
33           
34            }
35            
36           }
37}
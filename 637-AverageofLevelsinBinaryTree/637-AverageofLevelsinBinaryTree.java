// Last updated: 31/08/2026, 09:38:02
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        
4        if (p == null && q == null) {
5            return true;
6        }
7        
8        
9        if (p == null || q == null || p.val != q.val) {
10            return false;
11        }
12        
13        
14        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
15    }
16}
// Last updated: 24/08/2026, 09:32:15
1import java.util.*;
2
3class Solution {
4    public List<Integer> preorderTraversal(TreeNode root) {
5        List<Integer> result = new ArrayList<>();
6        if (root == null) return result;
7
8        Stack<TreeNode> stack = new Stack<>();
9        stack.push(root);
10
11        while (!stack.isEmpty()) {
12            TreeNode node = stack.pop();
13            result.add(node.val);
14
15            // Push right child first so left is popped and processed first
16            if (node.right != null) {
17                stack.push(node.right);
18            }
19            if (node.left != null) {
20                stack.push(node.left);
21            }
22        }
23
24        return result;
25    }
26}
// Last updated: 31/08/2026, 09:54:56
1import java.util.LinkedList;
2import java.util.Queue;
3
4class Solution {
5    public int minDepth(TreeNode root) {
6        if (root == null) {
7            return 0;
8        }
9
10        Queue<TreeNode> queue = new LinkedList<>();
11        queue.add(root);
12        int depth = 1;
13
14        while (!queue.isEmpty()) {
15            int levelSize = queue.size();
16
17            for (int i = 0; i < levelSize; i++) {
18                TreeNode current = queue.poll();
19
20                // First leaf node reached (shortest path found)
21                if (current.left == null && current.right == null) {
22                    return depth;
23                }
24
25                if (current.left != null) {
26                    queue.add(current.left);
27                }
28                if (current.right != null) {
29                    queue.add(current.right);
30                }
31            }
32
33            depth++;
34        }
35
36        return depth;
37    }
38}
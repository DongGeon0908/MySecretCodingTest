import com.sun.source.tree.Tree;

import java.util.Stack;

public class MaximumDepthOfBinaryTree_DFS {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        MaximumDepthOfBinaryTree a = new MaximumDepthOfBinaryTree();
        System.out.println(a.maxDepth(tree));
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> valudeStack = new Stack<>();
        stack.push(root);
        valudeStack.push(1);

        int max = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int count = valudeStack.pop();
            max = Math.max(max, count);

            if (node.left != null) {
                stack.push(node.left);
                valudeStack.push(count++);
            }
            if (node.right != null) {
                stack.push(node.right);
                valudeStack.push(count++);
            }
        }
        return max;
    }
}

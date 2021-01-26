package dailyCodes;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 14:58
 **/


//https://leetcode-cn.com/problems/balanced-binary-tree/
public class Day5Test5 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        int leftDeepth = maxDepth(root.left);
        int rightDeepth = maxDepth(root.right);
        if (leftDeepth - rightDeepth > 1 || leftDeepth - rightDeepth < -1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }

        int leftDeepth = maxDepth(root.left);
        int rightDeepth = maxDepth(root.right);

        return 1 + (Math.max(leftDeepth, rightDeepth));
    }
}

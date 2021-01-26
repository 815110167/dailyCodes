package dailyCodes;


/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 14:39
 **/


//https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/submissions/
public class Day5Test4 {
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


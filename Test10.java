package dailyCodes;


/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-26
 * @Time: 12:03
 **/

//https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/
public class Test10 {
    private TreeNode lac = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        find(root, p, q);
        return lac;
    }

    private boolean find(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;

        int left = find(root.left, p, q) ? 1 : 0;
        int right = find(root.right, p, q) ? 1 : 0;
        int mid = (root == p || root == q) ? 1 : 0;
        if (left+right+mid==2){
            lac = root;
        }
        return left+right+mid>0;

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

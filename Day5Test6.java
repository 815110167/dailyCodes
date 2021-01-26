package dailyCodes;

import dataStructure.java20210118.Tree;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 15:23
 **/

//https://leetcode-cn.com/problems/symmetric-tree/
public class Day5Test6 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null&&q==null) return true;
        if (p == null||q==null) return false;
        if (p.val != q.val) return false;
        return isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}

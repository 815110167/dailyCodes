package dailyCodes;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 11:31
 **/

//https://leetcode-cn.com/problems/same-tree/
public class Day5Test2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

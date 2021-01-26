package dailyCodes;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-26
 * @Time: 13:39
 **/

//https://www.nowcoder.com/practice/947f6eb80d944a84850b0538bf0ec3a5?tpId=13&&tqId=11179&rp=1&ru=/activity/oj&qru=/ta/coding-interviews/question-ranking
public class Test11 {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

        public TreeNode Convert(TreeNode pRootOfTree) {
            if (pRootOfTree == null) return null;
            if (pRootOfTree.left == null && pRootOfTree.right == null) return pRootOfTree;

            TreeNode left = Convert(pRootOfTree.left);
            TreeNode leftTail = left;
            while (leftTail != null && leftTail.right != null) leftTail = leftTail.right;

            if (left != null) {
                leftTail.right = pRootOfTree;
                pRootOfTree.left = leftTail;
            }

            TreeNode right = Convert(pRootOfTree.right);
            while (right != null && right.left != null) right = right.left;
            if (right != null) {
                right.left = pRootOfTree;
                pRootOfTree.right = right;
            }
            return left == null ? pRootOfTree : left;
        }
    }
}

package dailyCodes;


/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-26
 * @Time: 14:49
 **/

//https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

//https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/submissions/  逆序后序遍历然后以根右左的方式访问即可
public class Test12 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return buildTreeHelper(preorder, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int left, int right) {
        if (left >= right) {
            return null;
        }
        if (index >= preorder.length) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[index]);
        index++;

        int pos = find(inorder, left, right, root.val);

        root.left = buildTreeHelper(preorder, inorder, left, pos);
        root.right = buildTreeHelper(preorder, inorder, pos + 1, right);
        return root;
    }

    private int find(int[] inorder, int left, int right, int tofind) {
        for (int i = left; i < right; i++) {
            if (inorder[i] == tofind) {
                return i;
            }
        }
        return -1;
    }
}

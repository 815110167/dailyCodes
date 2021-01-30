package dailyCodes;


import java.util.Stack;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-28
 * @Time: 08:46
 **/


public class Test15 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode build() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        return a;
    }

    public static void preOrderByLoop(TreeNode root) {
        //非递归方式完成遍历
        //需要一个栈来辅助
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            System.out.print(top.val + " ");
            if (top.right != null) stack.push(top.right);
            if (top.left != null) stack.push(top.left);

        }
    }

    public static void inOrderByLoop(TreeNode root) {

        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (true) {
            //循环做找全部入栈
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            //判断栈是否为空
            if (stack.isEmpty()) {
                break;
            }

            //打印栈顶元素
            TreeNode top = stack.pop();
            System.out.print(top.val + " ");

            //遍历右子树
            cur = top.right;
        }
    }

    public static void posOrderByLoop(TreeNode root){
        if (root==null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (true){
            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()){
                break;
            }
            TreeNode top = stack.peek();
            if (top.right==null||prev==top.right){
                System.out.print(top.val+" ");
                stack.pop();
                prev = top;
            }else{
                cur = top.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode a = build();
        preOrderByLoop(a);
        System.out.println();
        inOrderByLoop(a);
        System.out.println();
        posOrderByLoop(a);

    }

}

package dailyCodes;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-24
 * @Time: 14:44
 **/


public class Day4Test {
    static class Testtree {

        //简单的创建一个二叉树
        public static Node build() {
            Node a = new Node('a');
            Node b = new Node('b');
            Node c = new Node('c');
            Node d = new Node('d');
            Node e = new Node('e');
            Node f = new Node('f');
            Node g = new Node('g');
            Node h = new Node('h');

            a.setLeft(b);
            a.setRight(c);
            b.setLeft(d);
            b.setRight(e);
            e.setLeft(g);
            g.setRight(h);
            c.setRight(f);

            return a;
        }

        //前序遍历
        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.getVal() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }

        //中序遍历
        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.getLeft());
            System.out.print(root.getVal() + " ");
            inOrder(root.getRight());
        }

        //后序遍历
        public static void posOrder(Node root) {
            if (root == null) {
                return;
            }
            posOrder(root.getLeft());
            posOrder(root.getRight());
            System.out.print(root.getVal() + " ");
        }

        //求二叉树所有节点
        public static int size(Node root) {
            if (root == null) {
                return 0;
            }

            //整个树的结点=根节点（1）+左子树节点+右子树节点
            return 1 + size(root.getLeft()) + size(root.getRight());

        }

        //求二叉树叶子节点
        public static int leafSize(Node root) {
            if (root == null) {
                return 0;
            }
            if (root.getRight() == null && root.getLeft() == null) {
                return 1;
            }
            return leafSize(root.getLeft()) + leafSize(root.getRight());
        }

        //求二叉树第K层的节点。
        public static int KLevelSize(Node root,int k) {
            if (k==0||root==null) return 0;
            if (k==1) return 1;
            return KLevelSize(root.getLeft(),k-1)+KLevelSize(root.getRight(),k-1);
        }

        //在二叉树中查找指定元素
        public static Node find(Node root,char val){
            if (root == null) {
                System.out.println("没有该元素");
                return null;
            }
            if (root.getVal()==val){
                System.out.println(val);
                return root;
            }

            //分别递归的去查找左右子树
            Node result= find(root.getLeft(),val);
            if (result!=null) return result;
            return find(root.getRight(),val);
        }

    }

    public static void main(String[] args) {
        Node root = Testtree.build();
        System.out.println("先序遍历");
        Testtree.preOrder(root);
        System.out.println("\n---------------------");
        System.out.println("中序遍历");
        Testtree.inOrder(root);
        System.out.println("\n---------------------");
        System.out.println("后序遍历");
        Testtree.posOrder(root);
        System.out.println("\n---------------------");
        System.out.println(Testtree.size(root));
        System.out.println("---------------------");
        System.out.println(Testtree.leafSize(root));
        System.out.println("---------------------");
        System.out.println(Testtree.KLevelSize(root, 3));
        System.out.println("---------------------");
        Testtree.find(root, 'c');
        System.out.println("---------------------");
    }
}

class Node {
    private char val;
    private Node left;
    private Node right;

    public Node(char val) {
        this.val = val;
    }

    public char getVal() {
        return val;
    }

    public void setVal(char val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
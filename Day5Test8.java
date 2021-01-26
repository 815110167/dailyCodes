package dailyCodes;


import java.util.Scanner;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 20:46
 **/

//https://www.nowcoder.com/practice/4b91205483694f449f94c179883c1fef?tpId=60&&tqId=29483&rp=1&ru=/activity/oj&qru=/ta/tsing-kaoyan/question-ranking
public class Day5Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.next();
            TreeNode root = build(line);
            inOrder(root);
            System.out.println();
        }

    }

    public static int index = 0;

    public static TreeNode build(String line) {
        return createTreePer(line);
    }

    public static TreeNode createTreePer(String line) {
        char ch = line.charAt(index);
        if (ch == '#') {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index++;
        root.left = createTreePer(line);
        root.right = createTreePer(line);
        return root;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}
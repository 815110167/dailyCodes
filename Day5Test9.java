package dailyCodes;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 23:11
 **/


public class Day5Test9 {
    static class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;

        TreeNode(Integer x) {
            val = x;
        }
        TreeNode (){

        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(null);
        TreeNode e = new TreeNode(null);
        TreeNode f = new TreeNode(15);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = f;
        c.right = g;

        System.out.println(levelOrder().toString());
    }

    public static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root ==null) return result;
        int level = 0;
        return helper(root,level);
    }

    private static List<List<Integer>> helper(TreeNode root, int level) {
        if (result.size()==level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        if (root.left!=null){
            helper(root.left,level+1);
        }
        if (root.right!=null){
            helper(root.right,level+1);
        }
        return result;
    }
}

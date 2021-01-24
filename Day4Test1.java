package dailyCodes;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-24
 * @Time: 18:26
 **/

//https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
public class Day4Test1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
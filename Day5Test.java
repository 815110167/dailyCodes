package dailyCodes;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 11:13
 **/


//https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
public class Day5Test {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}
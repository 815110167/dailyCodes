package dailyCodes;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 11:18
 **/

//https://leetcode-cn.com/problems/binary-tree-postorder-traversal/submissions/
public class Day5Test1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }
}

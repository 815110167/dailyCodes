package dailyCodes;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-25
 * @Time: 13:16
 **/

//https://leetcode-cn.com/problems/subtree-of-another-tree/submissions/
public class Day5Test3 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null&&t==null) return true;
        if(s==null||t==null)return false;
        boolean ret = isSametree(s,t);
        return ret||isSubtree(s.right,t);
    }

    public boolean isSametree(TreeNode a,TreeNode b){
        if(a==null && b==null) return true;
        if(a==null||b==null) return false;
        if(a.val != b.val) return false;
        return isSametree(a.left,b.left)&&isSametree(a.right,b.right);
    }
}

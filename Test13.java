package dailyCodes;

/**
 * @program: class
 * @description: .
 * @author: hdc
 * @Date: 2021-01-26
 * @Time: 18:10
 **/

//https://leetcode-cn.com/problems/construct-string-from-binary-tree/
public class Test13 {
    StringBuffer str = new StringBuffer();
    public String tree2str(TreeNode t) {
        if (t==null) return "";
        helper(t);
        str.deleteCharAt(0);
        str.deleteCharAt(str.length()-1);
        return str.toString();

    }

    private void helper(TreeNode t) {
        if (t==null) return ;
        str.append("(");
        str.append(t.val);
        helper(t.left);
        if (t.left==null&&t.right!=null){
            str.append("()");
        }
        helper(t.right);
        str.append(")");
    }

}

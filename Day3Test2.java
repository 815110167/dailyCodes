package dailyCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-22
 * @Time: 15:39
 **/

/**
 * 检测括号是否匹配
 * 输入：（）{}【】
 * 输出：true
 */
public class Day3Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(isVailid(string));
    }

    public static boolean isVailid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
            }
            if (stack.empty()) return false;
            char top = stack.peek();
            if (map.get(top) == c) continue;
            else {
                return false;
            }
        }
        if (stack.empty()) return true;
        return false;
    }
}

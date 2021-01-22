package dailyCodes;

import java.util.Stack;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-22
 * @Time: 18:38
 **/


public class Day3Test5 {
}

class MinStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty()) {
            stack2.push(x);
            return;
        }
        int min = stack2.peek();
        if (x < min) {
            min = x;
        }
        stack2.push(min);
    }

    //出栈
    public Integer pop() {
        if (stack1.isEmpty()) return null;
        stack2.pop();
        return stack1.pop();
    }

    //取栈顶元素
    public Integer top() {
        if (stack1.isEmpty()) return null;
        stack2.pop();
        return stack1.peek();
    }

    public Integer getMin() {
        if (stack2.isEmpty()) return null;
        return stack2.peek();
    }

}
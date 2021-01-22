package dailyCodes;

import dataStructure.java20210118.MyQueue;

import java.util.Stack;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-22
 * @Time: 18:06
 **/

/**
 * 基于栈实现队列
 */
public class Day3Test4 {
    //入队的栈
    Stack<Integer> stack1 = new Stack<>();

    //出队的栈
    Stack<Integer> stack2 = new Stack<>();

    //入栈
    public void push(int val) {
        while (stack2 != null) {
            Integer i = stack2.pop();
            stack2.push(i);
        }
        stack1.push(val);
    }

    //出栈
    public Integer pop() {
        if (empty()) return  null;
        while(!stack1.isEmpty()) {
            int ret = stack1.pop();
            stack2.push(ret);
        }
        return stack2.pop();
    }

    //取栈顶元素
    public Integer peek() {
        if (empty()) return  null;
        while(!stack1.isEmpty()) {
            int ret = stack1.pop();
            stack2.push(ret);
        }
        return stack2.peek();
    }

    //判断栈是否为空
    public boolean empty(){
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}

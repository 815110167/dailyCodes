package dailyCodes;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-22
 * @Time: 16:50
 **/

import java.util.LinkedList;
import java.util.Queue;

/**
 * 基于队列来实现栈
 */
public class Day3Test3 {
    public static void main(String[] args) {
        MyStackByQueue myStackByQueue = new MyStackByQueue();
    }


}

class MyStackByQueue {
    private Queue<Integer> A = new LinkedList<>();
    private Queue<Integer> B = new LinkedList<>();

    public void push(int x) {
        this.A.offer(x);
    }

    public Integer pop() {
        if (empty()) return null;


        //如果A队列非空，则把A队列中除了最后一个值之外的所有制转移到B中
        while (this.A.size() > 1) {
            Integer i = this.A.poll();
            this.B.offer(i);
        }
        int ret = A.poll();
        swapAB();
        return ret;
    }

    private void swapAB() {
        Queue<Integer> tmp = this.A;
        this.A = this.B;
        this.B = this.A;
    }

    public Integer top() {
        if (empty()) return null;


        //如果A队列非空，则把A队列中除了最后一个值之外的所有制转移到B中
        while (this.A.size() > 1) {
            Integer i = this.A.poll();
            this.B.offer(i);
        }
        int ret = A.poll();
        B.offer(ret);
        swapAB();
        return ret;
    }

    public boolean empty() {
        return this.A.isEmpty();
    }

}

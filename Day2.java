package dailyCodes;

import java.util.List;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-20
 * @Time: 20:10
 **/

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */

class MyListNode {
    int val;
    MyListNode next = null;

    MyListNode(int val) {
        this.val = val;
    }

    MyListNode() {
    }
}

public class Day2 {

    public static void main(String[] args) {
        MyListNode list1 = new MyListNode();
        MyListNode list2 = new MyListNode();
        for (int i  =0; i<=5;i++)
        {list1 = new MyListNode(i);}
        for (int i  =0; i<=5;i++)
        {list2 = new MyListNode(i);}
        System.out.println(Merge(list1, list2).val);
    }

    public static MyListNode Merge(MyListNode list1,MyListNode list2) {
        if(list1==null&&list2==null) return null;
        MyListNode cur = list1;
        MyListNode curNext = cur.next;
        MyListNode head = list1;

        while(list1.next!=null){
            list1 = list1.next;
        }
        list1.next = list2;

        while(cur.next!=null){
            while(curNext!=null){
                if(cur.val>curNext.val){
                    int i = curNext.val;
                    curNext.val = cur.val;
                    cur.val = i;
                }
                curNext = curNext.next;
            }
            cur = cur.next;
            curNext = cur;
        }
//         int i = curnext.val;
//         curnext.val = cur.val;
//         cur.val = i;
        return head;
    }
}



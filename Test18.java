package dailyCodes;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-31
 * @Time: 18:18
 **/

//https://leetcode-cn.com/problems/copy-list-with-random-pointer/
public class Test18 {
    public Node copyRandomList(Node head) {
        //遍历旧链表，把旧链表每个节点依次插入到map中，key是旧链表结点，value是拷贝出来的新节点
        Map<Node, Node> map = new HashMap<>();
        for (Node cur = head; cur != null; cur = cur.next) {
            map.put(cur, new Node(cur.val));
        }
        //再次遍历链表，修改新链表结点中的next和random
        for (Node cur = head; cur != null; cur = cur.next) {
            Node newCur = map.get(cur);
            newCur.next = map.get(cur.next);
            newCur.random = map.get(cur.random);
        }
        //返回新链表的头结点
        return map.get(head);
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

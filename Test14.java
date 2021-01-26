package dailyCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-26
 * @Time: 21:21
 **/

class Pair implements Comparable<Pair> {
    public int n1;
    public int n2;
    public int sum;

    public Pair(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.sum = n1 + n2;
    }

    @Override
    public int compareTo(Pair o) {
        return this.sum - o.sum;
    }
}
//https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
public class Test14 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                queue.offer(new Pair(nums1[i], nums2[j]));
            }
        }

        for (int i=0 ;i<k&&!queue.isEmpty();i++){
            Pair cur = queue.poll();
            List<Integer> tmp = new ArrayList<>();
            tmp.add(cur.n1);
            tmp.add(cur.n2);
            result.add(tmp);
        }

        return result;
    }
}

package dailyCodes;

import java.util.*;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-31
 * @Time: 21:51
 **/

//https://leetcode-cn.com/problems/top-k-frequent-words/description/
public class Test21 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : words) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }

        //keYSet相当于得到了一个set，set中存放的就是所有key
        ArrayList<String> arrayList = new ArrayList<>(map.keySet());
        Collections.sort(arrayList, new MyComparator(map));
        return arrayList.subList(0,k);
    }

    static class MyComparator implements Comparator<String> {
        private Map<String, Integer> map;

        public MyComparator(Map<String, Integer> hashMap) {
            this.map = hashMap;
        }

        @Override
        public int compare(String o1, String o2) {
            int count1 = map.get(o1);
            int count2 = map.get(o2);
            if (count1 == count2) {
                //String自身也实现了Comparable，自带字典序的比较功能的
                //compareTo就是在使用String默认的比较规则
                return o1.compareTo(o2);
            }

            //o1>o2,返回>0
            //o1<o2,返回<0
            //o1==o2,返回0
            //count1-conut2升序
            //count2-count1降序
            return count2 - count1;
        }
    }
}

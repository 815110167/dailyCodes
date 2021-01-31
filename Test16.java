package dailyCodes;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-31
 * @Time: 16:55
 **/

//https://leetcode-cn.com/problems/single-number/
public class Test16 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int x:nums){
            Integer val = map.get(x);
            if (val==null){
                map.put(x,1);
            }
            else{
                map.put(x,val+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return 0;
    }

    public int singleNumber1(int[] nums) {
        int j =0;
        for (int x:nums){
            j^=nums[x];
        }
        return j;
    }
}

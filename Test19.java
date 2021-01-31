package dailyCodes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-31
 * @Time: 20:01
 **/

//https://leetcode-cn.com/problems/jewels-and-stones/
public class Test19 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c:jewels.toCharArray()){
            set.add(c);
        }

        int ret = 0;
        for (char c:stones.toCharArray()){
            if(set.contains(c)){
                ret++;
            }
        }

        return ret;
    }
}

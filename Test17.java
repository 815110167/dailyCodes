package dailyCodes;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-31
 * @Time: 17:27
 **/

//https://leetcode-cn.com/problems/single-number-iii/
public class Test17 {
    public int[] singleNumber(int[] nums) {
        int ret = 0;
        for (int x : nums) {
            ret ^= x;
        }

        int bit = 1;
        int i = 0;
        for (; i < 32; i++) {
            if ((ret & (bit << i)) != 0) {
                break;
            }
        }
        int a = 0;
        int b = 0;
        for (int x : nums) {
            if ((x & (bit << i)) != 0) {
                a ^= x;
            } else {
                b ^= x;
            }
        }
        int[] array ={a,b};
        return array;
    }
}

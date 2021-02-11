package dailyCodes;

import java.util.HashMap;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-02-10
 * @Time: 22:29
 **/

//https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=13&tqId=11181&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tab=answerKey
public class Test23 {
    public int MoreThanHalfNum_Solution(int [] array) {

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }

        for (int i = 0;i<array.length;i++){
            if ((map.get(array[i])/2)>array.length){
                return array[i];
            }
        }
        return 0;
    }
}

package dailyCodes;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-19
 * @Time: 20:03
 **/

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * 输入：{3，4，5，1，2}
 * 返回值：1
 */
public class Day1 {
    public static int minNumberInRotateArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {

            //如果是递增数组直接输出0号下标
            if (array[i] < array[j]) {
                return array[i];
            }

            //求中间位值下标mid
            int mid = (i + j) / 2;

            //如果当前mid下标数值大于当前头位置下标数值，代表正处于递增阶段，
            //令开始位置从mid的下一个开始。
            if (array[mid] > array[i]) {
                i = mid + 1;
            }

            ////如果当前mid下标数值小于当末尾位置下标数值，代表结束第一个递增阶段，
            // 处于第二个递增阶段整体小于等于第一个递增阶段，最小值一定在mid+1之前，
            // 所以令末尾位置提前到mid。
            else if (array[mid] < array[j]) {
                j = mid;
            }

            //如果非以上情况，当前首位向后一位，重新茶盅中间位置
            else i++;
        }
        return array[i];
    }

    public static void main(String[] args) {
        int[] array = {0,1,1,1,1,1,1};
        System.out.println(minNumberInRotateArray(array));
    }
}

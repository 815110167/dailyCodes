package dailyCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: class
 * @description: 杨辉三角
 * @author: hdc
 * @Date: 2021-01-22
 * @Time: 10:57
 **/

/**
 * 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class Day3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(generate(scanner.nextInt()));

    }

    public static List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> fristLine = new ArrayList<>();
        fristLine.add(1);
        result.add(fristLine);
        if (numRows == 1) return result;

        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2) return result;

        for (int i = 3; i <= numRows; i++) {
            //得到第i-1行的内容
            List<Integer> prevLine = result.get((i - 1) - 1);
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);
            //第i行有i列
            for (int col = 2; col < i; col++) {
                curLine.add(prevLine.get((col - 1) - 1) + prevLine.get(col - 1));
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}

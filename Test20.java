package dailyCodes;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-31
 * @Time: 21:42
 **/

//https://www.nowcoder.com/questionTerminal/f88dafac00c8431fa363cd85a37c2d5e
public class Test20 {
    public static void main(String[] args) {
        //Set<Character> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String expected = scanner.next();
            String actual = scanner.next();

            expected = expected.toUpperCase();
            actual = actual.toUpperCase();

            Set<Character> actualset = new HashSet<>();

            for (char c : actual.toCharArray()) {
                actualset.add(c);
            }

            Set<Character> brokenKeySet = new HashSet<>();

            for (char c : expected.toCharArray()) {
                if (actualset.contains(c)) {
                    continue;
                }

                if (brokenKeySet.contains(c)) {
                    continue;
                }

                System.out.print(c);
                brokenKeySet.add(c);
            }
        }

    }

}

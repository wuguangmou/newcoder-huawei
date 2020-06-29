package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串（字符串长度不超过1000）。
 * 输入描述：输入N个字符      输出描述：输出该字符串反转后的字符串
 * 例：输入：abcd        输出：dcba
 */
public class HJ12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String  str = input.next();
        for (int i = str.length() - 1; i >= 0; i--) {
            //也可以将字符转成StringBuilder，然后利用StringBuilder的reserve()方法逆序输出
            System.out.print(str.charAt(i));
        }
    }
}

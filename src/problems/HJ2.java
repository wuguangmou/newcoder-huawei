package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * 输入描述：第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 * 输出描述：输出输入字符串中含有该字符的个数。
 * 例：输入："ABCDEF A"      输出：1
 */
public class HJ2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String target = input.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase(target)){
                count++;
            }
        }
        System.out.println(count);
    }
}

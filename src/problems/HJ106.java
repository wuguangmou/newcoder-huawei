package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/24
 * @Description: 将一个字符串str的内容颠倒过来，并输出str的长度(不超过100个字符)。
 * 输入描述：输入一个字符串，可以有空格     输出描述：输出逆序的字符串
 * 例：输入"I am a student"    输出"tneduts a ma I"
 */
public class HJ106 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse().toString());
        }
    }
}

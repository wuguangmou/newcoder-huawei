package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 输入一个整数，将这个整数以字符串的形式逆序输出,程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，
 * 则输出为001。
 * 输入描述：输入一个int整数       输出描述：将这个整数以字符串的形式逆序输出
 * 例：输入：1516000     输出：0006151
 */
public class HJ11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String strNum = String.valueOf(num);
        for (int i = strNum.length() - 1; i >= 0; i--) {
            //也可以将数字转成StringBuilder，然后利用StringBuilder的reserve()方法逆序输出
            System.out.print(strNum.charAt(i));
        }
    }
}

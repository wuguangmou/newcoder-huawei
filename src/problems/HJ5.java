package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示（多组同时输入）。
 * 输入描述：输入一个十六进制的数值字符串。     输出描述：输出该数值的十进制字符串。
 * 例：输入：0xA     输出：10
 */
public class HJ5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            String hexNum = input.next();

            //将字符串中的"0x"去掉
            hexNum = hexNum.contains("0x") ? hexNum.replace("0x", "") : hexNum;
            int num = Integer.valueOf(hexNum, 16);
            System.out.println(num);
        }
    }
}

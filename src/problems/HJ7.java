package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * 输入描述：输入一个正浮点数值       输出描述：输出该数值的近似整数值
 * 例：输入：5.5         输出：6
 */
public class HJ7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextDouble()){
            double num = input.nextDouble();
            //也可以直接调用Math.round(num)，直接输出四舍五入后的数

            String numStr = String.valueOf(num);
            String[] subNumStr = numStr.split("\\.");
            //由于接受到的是正浮点数，因此可以通过这样去判断
            if (Integer.valueOf(subNumStr[1]) >= 5){
                System.out.println(Integer.valueOf(subNumStr[0]) + 1);
            } else {
                System.out.println(Integer.valueOf(subNumStr[0]));
            }
            System.out.println(Math.round(num));
        }
    }
}

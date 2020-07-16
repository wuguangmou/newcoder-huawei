package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/7/16
 * @Description: 正整数A和正整数B的最小公倍数是指能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 * 输入描述：输入两个正整数A和B。         输出描述：输出A和B的最小公倍数。
 * 例：输入：5 7         输出：35
 */
public class HJ108 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int a = input.nextInt();
            int b = input.nextInt();

            //最小公倍数 = 两个数的乘积 / 最大公约数
            System.out.println(a * b / getGCD(a, b));
        }
    }

    //获取两个整数的最大公约数，通过辗转相除法
    private static int getGCD(int a, int b){
        if (b == 0){
            return a;
        }
        return getGCD(b, a % b);
    }
}

package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/8/3
 * @Description: 自守数是指一个数的平方的尾数等于该数自身的自然数。例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n以
 * 内的自守数的个数。
 * 输入描述：int型整数          输出描述：n以内自守数的数量
 * 例：输入：2000              输出：8
 */
public class HJ99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            System.out.println(calcAutomorphicNumbers(n));
        }
    }
    //计算n以内自守数的个数
    private static int calcAutomorphicNumbers(int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            long squareNum = i * i;
            if (String.valueOf(squareNum).endsWith(String.valueOf(i))){
                count++;
            }
        }
        return count;
    }
}

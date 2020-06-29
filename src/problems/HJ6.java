package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）,最后一个数
 * 后面也要有空格。
 * 输入描述：输入一个long型整数     输出描述：按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 * 例：输入：180     输出：2 2 3 3 5
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLong()){
            long num = input.nextLong();
            while (num != 1){
                for (int i = 2; i <= num; i++) {
                    //当且仅当num能被整除时，输出它的质因子，并且重置num
                    if (num % i == 0){
                        System.out.print(i + " ");
                        num /= i;
                        break;
                    }
                }
            }
        }
    }
}

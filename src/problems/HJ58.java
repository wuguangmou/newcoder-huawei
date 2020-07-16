package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/6
 * @Description: 输入n个整数，输出其中最小的k个。
 * 输入描述：第一行输入两个整数n、k，n为数组元素个数，k为需要输出的最小的个数，第二行输入一个整数数组
 * 输出描述：输出一个整数数组
 * 例：输入：5 2             输出：1 2
 *          1 3 5 7 2
 */
public class HJ58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            int k = input.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }
            Arrays.sort(array);
            for (int i = 0; i < k; i++) {
                if (i == k - 1){
                    System.out.println(array[i]);
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}

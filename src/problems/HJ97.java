package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/24
 * @Description: 首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。
 * 输入描述：首先输入一个正整数n，然后输入n个整数。    输出描述：输出负数的个数，和所有正整数的平均值。
 * 例：输入：5 1 2 3 4 5     输出：0 3
 */
public class HJ97 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            //total为所有正整数之和，negCount为负数个数
            int total = 0, negCount = 0;
            //aver为统计的平均值，posCount为正整数个数
            float aver, posCount = 0f;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] > 0){
                    posCount++;
                    total += arr[i];
                }
                if (arr[i] < 0) {
                    negCount++;
                }
            }
            aver = total/posCount;
            System.out.println(negCount+" "+String.format("%.1f",aver));
        }
        scanner.close();
    }
}

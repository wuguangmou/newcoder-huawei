package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/7/23
 * @Description: 从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值，结果保留一位小数，如果没有非负数，则平均值为0。
 * 本题有多组输入数据，输入到文件末尾，数据范围小于1e6。
 * 输入描述：输入任意个整数         输出描述：输出负数个数以及所有非负数的平均值
 * 示例：输入：-13 -4 -7           输出：3 0.0
 */
public class HJ105 {
    public static void main(String[] args) {

        int negCount = 0, sum = 0;      //负数个数、非负数(自然数)个数、非负数总值
        float otherCount = 0f;
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int num = input.nextInt();
            if (num < 0){
                negCount++;             //统计负数个数
            } else {
                sum += num;
                otherCount++;           //统计非负数个数及所有非负数的总值
            }
        }
        System.out.println(negCount);
        System.out.printf("%.1f", otherCount == 0 ? 0 : sum/otherCount);
    }
}
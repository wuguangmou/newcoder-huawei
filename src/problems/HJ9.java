package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 输入描述：输入一个int型整数      输出描述：按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 * 例：输入：9876673         输出：37689
 */
public class HJ9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String numStr = String.valueOf(num);
        //定义一个长度为10的数组，用于记录数字0-9是否出现
        int[] arr = new int[10];
        for (int i = numStr.length() - 1; i >=0 ; i--) {
            if (arr[numStr.charAt(i) - '0'] == 0){
                System.out.print(numStr.charAt(i));
                arr[numStr.charAt(i) - '0'] = 1;
            }
        }
    }
}

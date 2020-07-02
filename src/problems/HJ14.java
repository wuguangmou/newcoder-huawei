package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述：输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述：数据输出n行，输出结果为按照字典序排列的字符串。
 * 例：输入：9 cap to cat card two too up boat boot
 *     输出：boat boot cap card cat to too two up
 */
public class HJ14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = input.next();
            arr[i] = str;
        }
        Arrays.sort(arr);
        for (String anArr : arr) {
            System.out.println(anArr);
        }
    }
}

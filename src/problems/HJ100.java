package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/7/30
 * @Description: 对于等差数列2，5，8，11，14... 要求输入一个正整数N(N>0)，输出等差数列的前N项之和。
 * 输入描述：输入一个正整数     输出描述：输出一个相加后的整数
 * 例：输入：2                 输出：7
 */
public class HJ100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            //等差数列前n项和公式：Sn = na1 + n(n - 1)d/2，首项为a1，末项为an，项数为n，公差为d
            //直接使用公式而不是for循环的好处是时间复杂度从O(n)降到了O(1)
            int result = 2*n + n*(n - 1)*3/2;
            System.out.println(result);
        }
    }
}

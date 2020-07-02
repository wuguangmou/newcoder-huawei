package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/7/2
 * @Description: 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * 输入描述： 输入一个整数（int类型）      输出描述：这个数转换成2进制后，输出1的个数
 * 例：输入：5       输出：2
 */
public class HJ15 {

    //更多解法详见：https://leetcode-cn.com/problems/number-of-1-bits/solution/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        String binaryStr = Integer.toBinaryString(n);
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) - '0' == 1){
                //遍历二进制字符串，统计字符'1'的个数
                count++;
            }
        }
        System.out.println(count);
    }

    //直接调用Integer.bitCount()方法
    public static int solution1(int n){
        return Integer.bitCount(n);
    }

    //遍历int数字的32位，使用位掩码来检查数字的第i位
    public static int solution2(int n){
        int bits = 0;
        //位掩码的初始值为：0000 0000 0000 0000 0000 0000 0000 0001
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            //通过与运算，统计数字中1的个数
            if ((n & mask) != 0) {
                bits++;
            }
            //每进行一次与运算，将掩码左移一位
            mask <<= 1;
        }
        return bits;
    }
}

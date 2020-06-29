package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述：连续输入字符串(输入2次,每个字符串长度小于100)      输出描述：输出到长度为8的新字符串数组
 * 例：输入：abc                 输出：abc00000
 *          123456789                12345678
 *                                   90000000
 */
public class HJ4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {

            String str = input.nextLine();
            //只要字符串的长度大于8，则输出其前8位子串
            while (str.length() > 8){
                String subStr = str.substring(0,8);
                System.out.println(subStr);
                str = str.substring(8);
            }
            int n =str.length();
            //当字符串的长度不足8位时，进行补0操作
            for (int i = 0; i < 8 - n; i++) {
                str = str.concat("0");
            }
            System.out.println(str);
        }
    }
}

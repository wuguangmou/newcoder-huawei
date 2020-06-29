package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范
 * 围内的不作统计。多个相同的字符只计算一次（输入：abaca，输出：3）。
 * 输入描述：输入N个字符，字符在ACSII码范围内。        输出描述：输出范围在(0~127)字符的个数。
 * 例：输入：abc     输出：3
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 0 && str.charAt(i) < 127 ){
                count++;
                //每统计一次相应的字符，就在字符串中将该字符置空，防止后续重复出现
                str = str.replace(String.valueOf(str.charAt(i)), "");
                i--;
            }
        }
        System.out.println(count);
    }
}

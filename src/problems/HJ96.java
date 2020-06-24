package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/24
 * @Description: 将一个字符中所有出现的数字前后加上符号"*"，其他字符保持不变。
 * 输入描述：输入一个字符串     输出描述：字符中所有出现的数字前后加上符号“*”，其他字符保持不变
 * 例：输入："Jkdi234klowe90a3"      输出："Jkdi*234*klowe*90*a*3*"
 */
public class HJ96 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String str = scanner.next();
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            //在每一位数字前后加上'*'
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                    sb.append("*").append(str.charAt(i)).append("*");
                } else {
                    sb.append(str.charAt(i));
                }
            }
            str = sb.toString();
            //将邻接数字间的"**"替换成""字符串
            str = str.replace("**", "");
            System.out.println(str);
        }
    }
}

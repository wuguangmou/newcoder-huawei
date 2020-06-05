package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/5
 * @Description: 对输入的字符串进行加解密，并输出，解密方法为加密的逆过程。
 * 规则：1.当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a
 *      2.当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0
 *      3.其他字符不做变化
 */
public class HJ29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //循环处理多组测试用例
        while (scanner.hasNext()){
            String toEncodingStr = scanner.next();
            String toDecodingStr = scanner.next();
            System.out.println(encode(toEncodingStr));
            System.out.println(decode(toDecodingStr));
        }
    }

    //加密方法
    private static String encode(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //对字符串中的数字进行加一操作，如果字符是9，则替换成0
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                if (str.charAt(i) == '9'){
                    result.append("0");
                } else {
                    result.append((char)(str.charAt(i)+1));
                }
            }
            //对字符串中的小写字母进行后一位替换，同时变换成大写
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                if (str.charAt(i) == 'z'){
                    result.append('A');
                } else {
                    result.append((char)(str.charAt(i) - 31));
                }
            }
            //对字符串中的大写字母进行后一位替换，同时变换成小写
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                if (str.charAt(i) == 'Z'){
                    result.append('a');
                } else {
                    result.append((char)(str.charAt(i) + 33));
                }
            }

        }
        return result.toString();
    }

    //解密方法
    private static String decode(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //对字符串中的数字进行减一操作，如果字符是0，则替换成9
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                if (str.charAt(i) == '0'){
                    result.append("9");
                } else {
                    result.append((char)(str.charAt(i)-1));
                }
            }
            //对字符串中的小写字母进行前一位替换，同时变换成大写
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                if (str.charAt(i) == 'a'){
                    result.append('Z');
                } else {
                    result.append((char)(str.charAt(i)-33));
                }
            }
            //对字符串中的大写字母进行前一位替换，同时变换成小写
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                if (str.charAt(i) == 'A'){
                    result.append('z');
                } else {
                    result.append((char)(str.charAt(i)+31));
                }
            }

        }
        return result.toString();
    }
}

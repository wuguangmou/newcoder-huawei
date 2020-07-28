package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/7/23
 * @Description: 连续输入字符串(输出次数为N, 字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，长度不是8整数倍的
 * 字符串请在后面补数字0，空字符串不处理。
 * 输入描述：首先输入数字n，表示要输入多少个字符串。连续输入字符串(输出次数为N,字符串长度小于100)。
 * 输出描述：按长度为8拆分每个字符串后输出到新的字符串数组，长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 例：输入：2               输出：abc00000
 *          abc                  12345678
 *          123456789            90000000
 *  (备注：此题与HJ4类似，只不过输入时，多了一个数字n，代表字符串的个数)
 */
public class HJ104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            //n代表输入的字符串个数
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                String str = input.next();
                addString(str);
            }
        }
    }

    private static void addString(String str){
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

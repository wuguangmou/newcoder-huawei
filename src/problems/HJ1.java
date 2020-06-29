package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/24
 * @Description: 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述：一行字符串，非空，长度小于5000       输出描述：整数N，最后一个单词的长度
 * 例：输入："hello world"     输出：5
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String[] splitArr = str.split(" ");
        int length = splitArr.length;
        System.out.println(splitArr[length-1].length());
    }
}

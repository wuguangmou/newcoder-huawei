package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”，所有单词之间用一个空格隔开，语句
 * 中除了英文字母外，不再包含其他字符。
 * 输入描述：将一个英文语句以单词为单位逆序排放。      输出描述：得到逆序的句子
 * 例：输入：I am a boy      输出描述：boy a am I
 */
public class HJ13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();
        String[] arrStr = sentence.split(" ");
        for (int i = arrStr.length - 1; i >= 0; i--) {
            System.out.print(arrStr[i] + " ");
        }
    }
}

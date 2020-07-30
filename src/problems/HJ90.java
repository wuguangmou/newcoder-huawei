package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/7/28
 * @Description: 现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号
 * 整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。现在需
 * 要你用程序来判断IP是否合法。
 * 输入描述：输入一个IP地址。           输出描述：返回判断的结果，YES or NO
 * 例：输入：10.138.15.1               输出：YES
 */
public class HJ90 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            String ipv4 = input.next();
            String result = isIpv4(ipv4) ? "YES" : "NO";
            System.out.println(result);
        }
    }
    //判断一个IP是否是合法的IPV4
    private static boolean isIpv4(String ip){
        String[] subStr = ip.split("\\.");
        if (subStr.length != 4){
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (Integer.valueOf(subStr[i]) < 0 || Integer.valueOf(subStr[i]) > 255){
                return false;
            }
        }
        return true;
    }
}

package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @User: 吴广谋
 * @Date: 2020/7/15
 * @Description: 1、中文大写金额数字前应标明“人民币”字样。中文大写金额数字应用壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、仟、万、
 * 亿、元、角、分、零、整等字样填写。（30分）
 * 2、中文大写金额数字到“元”为止的，在“元”之后，应写“整”字，如￥ 532.00应写成“人民币伍佰叁拾贰元整”。在“角”和“分”后面不写“整”字。（30分）
 * 3、阿拉伯数字中间有“0”时，中文大写要写“零”字，阿拉伯数字中间连续有几个“0”时，中文大写金额中间只写一个“零”字，如￥6007.14，应写
 * 成“人民币陆仟零柒元壹角肆分”。（40分）
 * 输入描述：输入一个double数         输出描述：输出人民币格式
 * 例：输入：151121.15               输出：人民币拾伍万壹仟壹佰贰拾壹元壹角伍分
 */
public class HJ95 {

    /**
     * 这个题目对于在银行工作的小伙伴应该有一定意义，恰巧我的第一份工作就是在银行工作，有一个业务需求是大小写金额是否一致比对，对于
     * 录入的大写金额和小写金额做比较，希望能够帮助到小伙伴。
     * ps：对于输入100000.00，应该返回的是人民币壹拾万元整；类似，对于输入10.73，返回的应是：人民币壹拾叁元陆角肆分
     */
    private final static char[] digit = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖', '拾', '佰', '仟', '万', '亿'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            double money = Double.parseDouble(str);
            System.out.println(convert(money));
        }
    }

    private static String convert(double money) {
        StringBuilder result = new StringBuilder("人民币");
        //处理整数部分
        long n = (long) money;
        if (n > 0) {
            convert(n, result);
            result.append("元");
        }
        //处理小数部分
        int v = (int) (money * 100 - n * 100 + 0.001);  //对于小数，额外加0.001的精度，防止强转时精度丢失
        int i = v / 10;
        int j = v % 10;
        if (i == 0 && j == 0) {
            result.append("整");
            return result.toString();
        }
        if (i != 0) {
            result.append(digit[i]).append("角");
        }
        if (j != 0) {
            result.append(digit[j]).append("分");
        }
        return result.toString();
    }

    //递归去处理每一位数字
    private static void convert(long n, StringBuilder result) {
        if (n >= 100000000) {
            long q = n / 100000000;
            long r = n % 100000000;
            convert(q, result);
            result.append("亿");
            if (r != 0) {
                convert(r, result);
            }
        } else if (n >= 10000) {

            long q = n / 10000;
            long r = n % 10000;
            convert(q, result);
            result.append("万");
            if (r != 0) {
                if (r < 1000) {
                    result.append("零");
                }
                convert(r, result);
            }
        } else if (n >= 1000) {
            long q = n / 1000;
            long r = n % 1000;
            convert(q, result);
            result.append("仟");
            if (r != 0) {
                if (r < 100) {
                    result.append("零");
                }
                convert(r, result);
            }
        } else if (n >= 100) {
            long q = n / 100;
            long r = n % 100;
            convert(q, result);
            result.append("佰");
            if (r != 0) {
                if (r < 10) {
                    result.append("零");
                }
                convert(r, result);
            }
        } else if (n >= 10) {
            long q = n / 10;
            long r = n % 10;
            //如果想通过所有的测试案例，在convert()这行代码加个判断条件，当q>1时才执行此方法。
            convert(q, result);
            result.append("拾");
            if (r != 0) {
                convert(r, result);
            }
        } else {
            result.append(digit[(int) n]);
        }
    }
}

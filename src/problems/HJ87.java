package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/6/5
 * @Description: 密码按如下规则进行计分，并根据不同的得分为密码进行安全等级划分。
 * 一、密码长度： 5分: 小于等于4个字符    10分: 5到7字符                25分: 大于等于8个字符
 * 二、字母：     0分: 没有字母          10分: 全都是小（大）写字母     20分: 大小写混合字母
 * 三、数字:      0分: 没有数字          10分: 1个数字                20分: 大于1个数字
 * 四、符号:      0分: 没有符号          10分: 1个符号                25分: 大于1个符号
 * 五、奖励:      2分: 字母和数字         3分: 字母、数字和符号         5分: 大小写字母、数字和符号
 *
 * 最后的评分标准:  >= 90: 非常安全      >= 80: 安全（Secure）      >= 70: 非常强      >= 60: 强（Strong）
 *                >= 50: 一般（Average）    >= 25: 弱（Weak）      >= 0:  非常弱
 * 对应的输出为：VERY_SECURE, SECURE, VERY_STRONG, STRONG, AVERAGE, WEAK, VERY_WEAK,
 * 例： 输入：38$@NoNoNo     输出：VERY_SECURE
 */
public class HJ87 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            String passwordStr = input.next();
            System.out.println(getPasswordLevel(passwordStr));
        }
    }

    private static String getPasswordLevel(String password){
        int lengthScore = getLengthScore(password);
        int letterScore = getLettersScore(password);
        int numScore = getNumScore(password);
        int symbolScore = getSymbolScore(password);
        int extraScore = getExtraScore(password);

        int value = lengthScore + letterScore + numScore + symbolScore + extraScore;
        if (value >= 90){
            return "VERY_SECURE";
        } else if (value >= 80){
            return "SECURE";
        } else if (value >= 70){
            return "VERY_STRONG";
        } else if (value >= 60){
            return "STRONG";
        } else if (value >= 50){
            return "AVERAGE";
        } else if (value >= 25){
            return "WEAK";
        } else {
            return "VERY_WEAK";
        }
    }
    //计算密码长度分值
    private static int getLengthScore(String password){
        int value;
        if (password.length() >= 8){
            value = 25;
        } else {
            value = password.length() <= 4 ? 5 : 10;
        }
        return value;
    }
    //计算字母分值
    private static int getLettersScore(String password){
        int value;
        if (!password.matches(".*[a-zA-Z]+.*")){
            value = 0;
        }
        else if(!password.matches(".*[a-z]+.*")) {
            value = 10;
        }
        else {
            value = 20;
        }
        return value;
    }
    //计算数字分值
    private static int getNumScore(String password){
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                count++;
            }
        }
        if (count == 0){
            return 0;
        }
        return count > 1 ? 20 : 10;
    }
    //计算符号分值
    private static int getSymbolScore(String password){
        String newStr = password.replaceAll("[0-9]", "").replaceAll("[a-zA-Z]", "");
        if (newStr.length() == 0){
            return 0;
        }
        return newStr.length() > 1 ? 25 : 10;
    }
    //计算额外分值
    private static int getExtraScore(String password){
        //没有数字或字母时，无额外分值奖励
        if (getNumScore(password) == 0 || getLettersScore(password) == 0){
            return 0;
        }
        //如果无符号时，说明字母和数字，奖励额外的2分
        if (getSymbolScore(password) == 0){
            return 2;
        }
        //当字母分值为10时，说明只有单一的大（小）写字母，且密码有符号，奖励
        if (getLettersScore(password) == 10){
            return 3;
        }
        //当字母分值为20时，说明有大小写金额且有符号，奖励5分
        if (getLettersScore(password) == 20){
            return 5;
        }
        //其他情况，返回0
        return 0;
    }
}

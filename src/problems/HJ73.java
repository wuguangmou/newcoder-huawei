package problems;

import java.util.Scanner;

/**
 * @User: 吴广谋
 * @Date: 2020/8/4
 * @Description: 根据输入的日期，计算是这一年的第几天。详细描述：输入某年某月某日，判断这一天是这一年的第几天？
 * 输入描述：输入三行，分别是年，月，日           输出描述：成功:返回outDay输出计算后的第几天;失败:返回-1
 * 例：输入：2012            输出：366
 *          12
 *          31
 */
public class HJ73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int y = input.nextInt();
            int m = input.nextInt();
            int d = input.nextInt();
            System.out.println(convertDateToDay(y, m, d));
        }
    }
    //将输入的年月日转换成这一年的第几天
    private static int convertDateToDay(int year, int month, int day){
        int[] dayArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //判断是否是闰年，闰年判断规则：四年一闰,百年不闰,四百年再闰
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            dayArr[1] = 29;
        }
        //校验是否合法输入
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > dayArr[month - 1]){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += dayArr[i];
        }
        return sum + day;
    }
}

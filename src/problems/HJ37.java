package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @User: 吴广谋
 * @Date: 2020/6/6
 * @Description: 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问
 * 每个月的兔子总数为多少？
 * 输入描述：输入int型表示month     输出描述：输出兔子总数int类型
 * 例：输入：9     输出：34
 */
public class HJ37 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null){
            int month = Integer.parseInt(line);
            System.out.println(getTotalCount(month));
        }
    }
    //问题的实质其实是斐波那契数列，在此不作阐述
    private static int getTotalCount(int month){
        //便于理解，数组下标从1开始，因此长度为n+1
        int[] f = new int[month+1];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= month; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[month];
    }
}

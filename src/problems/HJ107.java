package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @User: 吴广谋
 * @Date: 2020/7/16
 * @Description: 计算一个数字的立方根，不使用库函数
 * 输入描述：待求解参数，double类型          输出描述：输入参数的立方根，也是double类型
 * 例：输入：216         输出：6.0
 */
public class HJ107 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double result = getCubeRoot(Double.parseDouble(str));
        System.out.printf("%.1f", result);
    }

    private static double getCubeRoot(double a){
        /*
         * 要求解a的立方根，令f(x) = x^3 - a，即求解f(x) = x^3 -a = 0
         * 利用泰勒公式展开，f(x)在x0(零点)处的函数值为：
         * f(x) = f(x0) + f'(x0)(x-x0) = x0^3 - a + 3x0^2(x-x) = 0
         * 解之，得x = x0 - (x0^3 - a)/(3x0^2)
         */
        double x = 1.0;
        //利用牛顿迭代法，迭代求解近似方程
        while (Math.abs(x*x*x - a) > 1e-9){
            x = x - (x*x*x - a) / (3*x*x);
        }
        return x;
    }
}

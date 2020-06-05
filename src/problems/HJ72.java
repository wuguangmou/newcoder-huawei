package problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @User: 吴广谋
 * @Date: 2020/6/5
 * @Description: 百鸡百钱问题。公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，
 * 鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 * 输入：任何一个整数，为了运行程序         输出：list，list为鸡翁、鸡母、鸡雏组合的列表。
 * 例：输入：1           输出：0 25 75
 *                           4 18 78
 *                           8 11 81
 *                           12 4 84
 */
public class HJ72 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (br.readLine() != null){
            //i为公鸡的数量
            for (int i = 0; i <= 20; i++) {
                //j为母鸡的数量
                for (int j = 0; j <= 33; j++) {
                    //k为小鸡的数量
                    int k = 100 - i - j;
                    if ((5*i + 3*j + k/3.0) == 100){
                        //输出i、j、k
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}

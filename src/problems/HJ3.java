package problems;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找
 * 同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
 * 样例输入解释：
 * 样例有两组测试
 * 第一组是3个数字，分别是：2，2，1。
 * 第二组是11个数字，分别是：10，20，40，32，67，40，20，89，300，400，15。
 * 例：输入：3 2 2 1 11 10 20 40 32 67 40 20 89 300 400 15      输出：1 2 10 15 20 32 40 67 89 300 400
 */
public class HJ3 {

    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>(); //使用TreeSet保证集合的顺序，且实现了去重功能

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            treeSet.clear();                    //每次输入新的测试案例时，将treeSet置空
            int n = input.nextInt();            //第一个n为输入随机数的个数
            for (int i = 0; i < n; i++) {
                int curRandom = input.nextInt();
                treeSet.add(curRandom);
            }

            for (Integer aTreeSet : treeSet) {
                System.out.println(aTreeSet);
            }
        }
    }
}

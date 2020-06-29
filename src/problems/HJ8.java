package problems;

import java.util.*;

/**
 * @User: 吴广谋
 * @Date: 2020/6/29
 * @Description: 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按
 * 照key值升序进行输出。
 * 输入描述：第一行先输入键值对的个数，剩下的每行输入成对的index和value值，以空格隔开
 * 输出描述：输出合并后的键值对（多行）
 * 例：输入：4           输出：0 3
 *          0 1              1 2
 *          0 2              3 4
 *          1 2
 *          3 4
 */
public class HJ8 {
    public static void main(String[] args) {
        SortedMap<Integer, Integer> map = new TreeMap<>();

        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int key = input.nextInt();
            int value = input.nextInt();
            if (map.containsKey(key)){
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }
        //按格式输出map中元素
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }
    }
}

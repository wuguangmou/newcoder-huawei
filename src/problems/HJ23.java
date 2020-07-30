package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @User: 吴广谋
 * @Date: 2020/7/30
 * @Description: 删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持
 * 原来的顺序。
 * 输入描述：字符串只包含小写英文字母，不考虑非法输入，输入的字符串长度小于等于20个字节。
 * 输出描述：删除字符串中出现次数最少的字符后的字符串。
 * 例：输入：abcdd       输出：dd
 */
public class HJ23 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null){
            System.out.println(delLeastFreqStr(str));
        }
    }
    //删除字符串中出现频率最小的字符串，若多个字符串出现频率一样，则都删除
    private static String delLeastFreqStr(String str){
        Map<Character, Integer> hashMap = new HashMap<>();

        //将字符串中的每个字母按出现频率放入hashMap中
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }

        //获取出现频率最小的值
        Collection<Integer> values = hashMap.values();
        int min = Collections.min(values);

        StringBuilder result = new StringBuilder();
        //遍历字符串，记录所有非最小频率的字符串，最后返回
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == min){
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}

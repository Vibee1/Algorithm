package code1205;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static String replaceLoveNum(int n, int m, String[] loveNum, String str){
        /*
        * 遍历非偏爱字符串，找到每个字符距离最近偏爱字符的距离，替换
        * 给每个字符维护一个哈希表，key: 字符下标、value：最近偏爱字符
        * 最后根据哈希表替换
        * ？同时替换怎么实现*/
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int maxFlag = Integer.MAX_VALUE;
            for (int j = 0; j < charArray.length; j++) {
                if(Arrays.asList(loveNum).contains(charArray[j])){
                    int maxTemp = Math.abs(i - j);
                    maxTemp = Math.min(maxTemp,maxFlag);
                }
            }
        }
        return "1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        String[] loveNum = sc.nextLine().split(" ");
        String str = sc.nextLine();
        String result = replaceLoveNum(n, m, loveNum, str);
        System.out.println(result);
    }
}

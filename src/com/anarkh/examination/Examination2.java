package com.anarkh.examination;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Anarkh
 * @date 2020/12/25 17:07
 * @description  写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，
 *               然后输出输入字符串中该字母的出现次数。不区分大小写。
 */
public class Examination2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String single = scanner.nextLine();
            System.out.println(count2(str,single));
        }
    }

    //方法1
    public static int count1(String str,String single){
        int num = 0;
        String[] strings = str.split("");
        for (String s:strings) {
            if(single.equalsIgnoreCase(s)){
                num++;
            }
        }
        return num;
    }

    //方法2
    public static int count2(String str,String single){
        //s.toUpperCase(),String 转化为大写
        //s.toLowerCase(),String 转化为小写
        //String字符转换，s.toCharArray()与s.charAt(index)
        //char字符转换，String.valueOf(c)转化为String
        int num = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (single.equalsIgnoreCase(String.valueOf(chars[i]))){
                num++;
            }
        }
        return num;
    }
}
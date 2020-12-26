package com.anarkh.examination;

import java.util.Scanner;

/**
 * @author Anarkh
 * @date 2020/12/26 16:15
 * @description
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 */
public class Examination5 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            //System.out.println(Integer.decode(str));
            System.out.println(Integer.parseInt(str,16));
        }
    }
}
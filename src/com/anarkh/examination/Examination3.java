package com.anarkh.examination;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Anarkh
 * @date 2020/12/26 9:41
 * @description
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，
 * 他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，
 * 不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
 * 按照排好的顺序去找同学做调查。
 * 请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 *
 * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
 *
 * 当没有新的输入时，说明输入结束。
 */
public class Examination3 {
    //TreeSet是一个包含有序的且没有重复元素的集合
    //for (int i = 0; i < n; ++i) {...} 之外，
    // 还可以写 while (n-- > 0) {...} 和 while (--n >= 0) {...}。


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<TreeSet> al = new ArrayList<>();
//        while (scanner.hasNext()){
//            int n = scanner.nextInt();
//            TreeSet<Integer> treeSet = new TreeSet<>();
//            while (n --> 0){
//                treeSet.add(scanner.nextInt());
//            }
//            al.add(treeSet);
//        }
//        for (TreeSet<Integer> t:al) {
//            for (int i: t) {
//                System.out.println(i);
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            TreeSet<Integer> set=new TreeSet<Integer>();
            int n=sc.nextInt();
            if(n>0){
                for(int i=0;i<n;i++){
                    set.add(sc.nextInt());
                }
            }
            for(Integer i:set){
                System.out.println(i);
            }
        }
    }

}
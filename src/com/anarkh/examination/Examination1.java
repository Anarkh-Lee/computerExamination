package com.anarkh.examination;

import java.util.Scanner;

/**
 * @author Anarkh
 * @date 2020/12/25 16:41
 * @description 计算字符串最后一个单词的长度，单词以空格隔开
 */
public class Examination1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(lastLength(str));
        }
    }

    //My own version
    public static int lastLength(String word){
        String[] wordArray = word.split(" ");
        String lastWord = wordArray[wordArray.length - 1];
        return lastWord.length();
    }

    //Official version

}

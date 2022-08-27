package com.mistra.leetcode.string;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2022/8/27 14:02
 * @ Description: 反转字符串中的元音字母 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class L345 {

    public String reverseVowels(String s) {
String y = "aeiou";
char[] array = s.toCharArray();
int i = 0, j = array.length - 1;
while (i < j) {
    while (i < j && y.indexOf(Character.toLowerCase(array[i])) < 0) {
        i++;
    }
    while (i < j && y.indexOf(Character.toLowerCase(array[j])) < 0) {
        j--;
    }
    char tmp = array[i];
    array[i++] = array[j];
    array[j--] = tmp;
}
return new String(array);
    }
}

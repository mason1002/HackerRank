package CamelCase;
/*
     Author:Mason
     2018/10/16 18:00
     It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , print the number of words in  on a new line.

For example, s = oneTwoThree. There are 3 words in the string.


*/

import java.util.Scanner;

public class Solution {


    // Complete the camelcase function below.
    static int camelCase(String s) {
        String arr[] = s.split("[A-Z]");
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = camelCase(s);
        System.out.println(result);

    }
}
package longHuTest.isPrime.generateNewInt;
/*
     Author:Mason
     2018/10/12 23:17
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        StringBuilder ans = new StringBuilder(s.substring(length - 1));
        for (int i = length - 2; i >= 0; i--) {
            if (!ans.toString().contains(s.substring(i, i + 1)))
                ans.append(s, i, i + 1);
        }
        System.out.println(ans);
    }
}

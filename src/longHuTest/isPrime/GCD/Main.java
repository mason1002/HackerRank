package longHuTest.isPrime.GCD;
/*
     Author:Mason
     2018/10/12 23:24
*/

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int temp;
//        if (x > y) {
//            temp = x;
//            x = y;
//            y = temp;
//        }
//        int a;
//        while (y % x != 0) {
//            a = x;
//            x = y % x;
//            y = a;
//        }
//        System.out.println(x);
//    }
//}

import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}

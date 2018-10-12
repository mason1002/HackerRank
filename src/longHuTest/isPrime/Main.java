package longHuTest.isPrime;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i < n; i += 2)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = isPrime(n);
        if (flag){
            System.out.println("T");
        }else {
            System.out.println("F");
        }
    }
}


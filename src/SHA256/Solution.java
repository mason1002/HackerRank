package SHA256;
/*
     Author:Mason
     2018/10/5 14:13
*/

import java.util.*;
import java.security.*;

/**
 * Sample Input
 * HelloWorld
 *
 * Sample Output 0
 * 872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4
 */
public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(s.getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
         System.out.println();
    }
}
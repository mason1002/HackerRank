package HashSet;/*
     Author:Mason
     2017/11/13 23:00
*/

import java.util.*;



public class Hashset {

    public static void main(String[] args) {

        System.out.println("Enter number of pairs: ");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        System.out.println("Enter the left pair and right pair(String): ");
        String[] left_pair = new String[t];

        String[] right_pair = new String[t];

        for (int i = 0; i < t; i++) {
            left_pair[i] = s.next();
            right_pair[i] = s.next();
        }

        HashSet<String> pairs = new HashSet<String>(t);

        for(int i = 0; i < t; i++){
            pairs.add("(" + left_pair[i] + ", " + right_pair[i] + ")");
            System.out.println(pairs.size());
        }



    }
}

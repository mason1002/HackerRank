package GradingStudent;
/*
     Author:Mason
     2018/10/17 20:09
*/

import java.io.*;
import java.util.*;


public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    private static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */

        for (int i = 0; i < grades.length; i++) {
            int y = grades[i] % 5;
            if (grades[i] >= 38 && 5 - y < 3) {
                grades[i] += (5 - y);
            }

        }
        return grades;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            int gradesItem = sc.nextInt();
            grades[i] = gradesItem;
        }

        int[] result = gradingStudents(grades);
        System.out.println(Arrays.toString(result));


    }

}
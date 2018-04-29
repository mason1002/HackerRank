package Sort;

import java.util.*;

public class Sort {
    public static void main(String[] args) {

        System.out.println("Enter the number of students: ");
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        int number = 1;

        ArrayList<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            System.out.println("Enter the " + number + "'s id: ");
            int id = in.nextInt();
            System.out.println("Enter the " + number + "'s name: ");
            String fname = in.next();
            System.out.println("Enter the " + number + "'s cpga: ");
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
            number++;
        }

        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparing(Student::getId));


        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

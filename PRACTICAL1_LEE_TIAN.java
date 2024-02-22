import java.util.Scanner;

public class PRACTICAL1_LEE_TIAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //take student information
        System.out.print("Enter Student ID: ");
        String student_id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String student_name = scanner.nextLine();
        System.out.print("Enter Course Year and Section: ");
        String courseSection = scanner.nextLine();
        //take grades
        System.out.print("Enter grade in subject1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter grade in subject2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter grade in subject3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter grade in subject4: ");
        int subject4 = scanner.nextInt();
        System.out.print("Enter grade in subject5: ");
        int subject5 = scanner.nextInt();
        //calculate total
        float total_grade = ((float)subject1 + (float)subject2 + (float)subject3 +(float)subject4 + (float)subject5)/5;
        //print
        System.out.println("Output -------- ");
        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Course Yr. and Section: " + courseSection);
        System.out.println("Average Grade: " + total_grade);
        scanner.close();
    }
}
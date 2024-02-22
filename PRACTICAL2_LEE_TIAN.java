import java.util.Scanner;

public class PRACTICAL2_LEE_TIAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = 1;
        //while (response){
        //take student information
        System.out.println("========= Student #" + studentCount + " =========");
        System.out.print("Enter student id: ");
        String student_id_n1 = scanner.nextLine();
        System.out.print("Enter student name: ");
        String student_name_n1 = scanner.nextLine();
        System.out.print("Enter course year and section: ");
        String course_section_n1 = scanner.nextLine();
        System.out.print("Enter Prelim grade: ");
        Double prelim_grade_n1 = scanner.nextDouble();
        System.out.print("Enter Midterm grade: ");
        Double midterm_grade_n1 = scanner.nextDouble();
        System.out.print("Enter Final  grade: ");
        Double final_grade_n1 = scanner.nextDouble();
        Double final_grade_score_n1 = (prelim_grade_n1 * 0.25) + (midterm_grade_n1 * 0.35) + (final_grade_n1 * 0.4);
        studentCount += 1;
        //output
        //take student information
        System.out.println("========= Student #" + studentCount + " =========");
        System.out.print("Enter student id: ");
        String student_id_n2 = scanner.nextLine(); scanner.nextLine();
        System.out.print("Enter student name: ");
        String student_name_n2 = scanner.nextLine();
        System.out.print("Enter course year and section: ");
        String course_section_n2 = scanner.nextLine();
        System.out.print("Enter Prelim grade: ");
        Double prelim_grade_n2 = scanner.nextDouble();
        System.out.print("Enter Midterm grade: ");
        Double midterm_grade_n2 = scanner.nextDouble();
        System.out.print("Enter Final  grade: ");
        Double final_grade_n2 = scanner.nextDouble();
        Double final_grade_score_n2 = (prelim_grade_n2 * 0.25) + (midterm_grade_n2 * 0.35) + (final_grade_n2 * 0.4);
        studentCount += 1;
        //take student information
        System.out.println("========= Student #" + studentCount + " =========");
        System.out.print("Enter student id: ");
        String student_id_n3 = scanner.nextLine(); scanner.nextLine();
        System.out.print("Enter student name: ");
        String student_name_n3 = scanner.nextLine();
        System.out.print("Enter course year and section: ");
        String course_section_n3 = scanner.nextLine();
        System.out.print("Enter Prelim grade: ");
        Double prelim_grade_n3 = scanner.nextDouble();
        System.out.print("Enter Midterm grade: ");
        Double midterm_grade_n3 = scanner.nextDouble();
        System.out.print("Enter Final  grade: ");
        Double final_grade_n3 = scanner.nextDouble();
        Double final_grade_score_n3 = (prelim_grade_n3 * 0.25) + (midterm_grade_n3 * 0.35) + (final_grade_n3 * 0.4);
        studentCount += 1;
        //take student information
        System.out.println("========= Student #" + studentCount + " =========");
        System.out.print("Enter student id: ");
        String student_id_n4 = scanner.nextLine();scanner.nextLine();
        System.out.print("Enter student name: ");
        String student_name_n4 = scanner.nextLine();
        System.out.print("Enter course year and section: ");
        String course_section_n4 = scanner.nextLine();
        System.out.print("Enter Prelim grade: ");
        Double prelim_grade_n4 = scanner.nextDouble();
        System.out.print("Enter Midterm grade: ");
        Double midterm_grade_n4 = scanner.nextDouble();
        System.out.print("Enter Final  grade: ");
        Double final_grade_n4 = scanner.nextDouble();
        Double final_grade_score_n4 = (prelim_grade_n4 * 0.25) + (midterm_grade_n4 * 0.35) + (final_grade_n4 * 0.4);
        studentCount += 1;
        //take student information
        System.out.println("========= Student #" + studentCount + " =========");
        System.out.print("Enter student id: ");
        String student_id_n5 = scanner.nextLine();scanner.nextLine();
        System.out.print("Enter student name: ");
        String student_name_n5 = scanner.nextLine();
        System.out.print("Enter course year and section: ");
        String course_section_n5 = scanner.nextLine();
        System.out.print("Enter Prelim grade: ");
        Double prelim_grade_n5 = scanner.nextDouble();
        System.out.print("Enter Midterm grade: ");
        Double midterm_grade_n5 = scanner.nextDouble();
        System.out.print("Enter Final  grade: ");
        Double final_grade_n5 = scanner.nextDouble();
        Double final_grade_score_n5 = (prelim_grade_n5 * 0.25) + (midterm_grade_n5 * 0.35) + (final_grade_n5 * 0.4);
        studentCount += 1;
        //
        //
        System.out.println("======== Student 1 ========");
        System.out.println("\nStudent ID: " + student_id_n1);
        System.out.println("Course Year and Section: " + course_section_n1);
        System.out.println("Student Name: " + student_name_n1);
        System.out.println("Prelim Grade: " + prelim_grade_n1);
        System.out.println("Midterm Grade: " + midterm_grade_n1);
        System.out.println("Final Grade: " + final_grade_n1);
        System.out.println("Average Grade: " + final_grade_score_n1 );

        System.out.println("\nStudent ID: " + student_id_n2);
        System.out.println("======== Student 2 ========");
        System.out.println("Student Name: " + student_name_n2);
        System.out.println("Course Year and Section: " + course_section_n2);
        System.out.println("Prelim Grade: " + prelim_grade_n2);
        System.out.println("Midterm Grade: " + midterm_grade_n2);
        System.out.println("Final Grade: " + final_grade_n2);
        System.out.println("Average Grade: " + final_grade_score_n2 );

        System.out.println("======== Student 3 ========");
        System.out.println("\nStudent ID: " + student_id_n3);
        System.out.println("Student Name: " + student_name_n3);
        System.out.println("Course Year and Section: " + course_section_n3);
        System.out.println("Prelim Grade: " + prelim_grade_n3);
        System.out.println("Midterm Grade: " + midterm_grade_n3);
        System.out.println("Final Grade: " + final_grade_n3);
        System.out.println("Average Grade: " + final_grade_score_n3 );

        System.out.println("======== Student 4 ========");
        System.out.println("\nStudent ID: " + student_id_n4);
        System.out.println("Student Name: " + student_name_n4);
        System.out.println("Course Year and Section: " + course_section_n4);
        System.out.println("Prelim Grade: " + prelim_grade_n4);
        System.out.println("Midterm Grade: " + midterm_grade_n4);
        System.out.println("Final Grade: " + final_grade_n4);
        System.out.println("Average Grade: " + final_grade_score_n4 );

        System.out.println("======== Student 5 ========");
        System.out.println("\nStudent ID: " + student_id_n5);
        System.out.println("Student Name: " + student_name_n5);
        System.out.println("Course Year and Section: " + course_section_n5);
        System.out.println("Prelim Grade: " + prelim_grade_n5);
        System.out.println("Midterm Grade: " + midterm_grade_n5);
        System.out.println("Final Grade: " + final_grade_n5);
        System.out.println("Average Grade: " + final_grade_score_n5 );
        //}
        scanner.close();
    }
}

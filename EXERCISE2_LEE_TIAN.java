import java.util.Scanner;

public class EXERCISE2_LEE_TIAN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("Enter your attendance grade [0-100]: ");
        double attendance_grade = (double) (scanner.nextInt() * 0.1);
        //
        System.out.print("Enter your exercises grade [0-100]: ");
        double exercises_grade = (double) (scanner.nextInt() * 0.15);
        //
        System.out.print("Enter your activities grade [0-100]: ");
        double activities_grade = (double) (scanner.nextInt() * 0.2);
        //
        System.out.print("Enter your practical grade [0-100]: ");
        double practical_grade = (double) (scanner.nextInt() * 0.25);
        //
        System.out.print("Enter your practical exam grade [0-100]: ");
        double practicalExam_grade = (double) (scanner.nextInt() * 0.3);

        //
        double total_grade = attendance_grade + exercises_grade + activities_grade + practicalExam_grade + practical_grade;
        System.out.println("Your total grade on this subject is: " + total_grade);
        scanner.close();
    }
}
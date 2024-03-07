import java.util.Scanner;

public class LeeTian_Practical {
    public static void main(String[] args){
        //Name - 0, course and year - 1, subject name - 2, prelim - 3, midterm -4 , final-5, average-6, remarks -7
        Scanner scanner = new Scanner(System.in);
        String[][] list = new String[5][8];

        for (int i = 0; i < 5; i++){
            System.out.println("------Student #" + i + "------");
            System.out.print("Enter student name: ");
            list[i][0] = scanner.nextLine();
            System.out.print("Enter student course year & section: ");
            list[i][1] = scanner.nextLine();
            System.out.print("Enter student subject name: ");
            list[i][2] = scanner.nextLine();
            System.out.print("Enter student prelim grade: ");
            list[i][3] = scanner.nextLine();
            System.out.print("Enter student midterm grade: ");
            list[i][4] = scanner.nextLine();
            System.out.print("Enter student final grade: ");
            list[i][5] = scanner.nextLine();

            //calculating average grade
            float prelim_grade = Float.parseFloat(list[i][3]) * 0.3f;
            float midterm_grade = Float.parseFloat(list[i][4]) * 0.3f;
            float final_grade = Float.parseFloat(list[i][5]) * 0.4f;
            float average = prelim_grade + midterm_grade + final_grade;
            list[i][6] = "" + average;

            //remarks
            if (average >= 65 && average <= 74){
                list[i][7] = "Did not meet the expectation";
            } else if (average >= 75 && average <= 79){
                list[i][7] = "Fairly satisfactory";
            } else if (average >= 80 && average <= 84){
                list[i][7] = "Satisfactory";
            } else if (average >= 85 && average <= 89){
                list[i][7] = "Very satisfactory";
            } else if (average >= 90 && average <=95){
                list[i][7] = "Outstanding";
            }
        }

        System.out.println("\n\n\n");
        for (int i = 0; i < 5; i++){
            System.out.println("\n------Student #" + i + " Details------");
            System.out.println("STUDENT NAME: " + list[i][0]);
            System.out.println("Course, Yr. & Section: " + list[i][1]);
            System.out.println("Subject Name: " + list[i][2]);
            System.out.println("PRELIM GRADE: " + list[i][3]);
            System.out.println("MIDTERM GRADE: " + list[i][4]);
            System.out.println("FINAL GRADE: " + list[i][5]);
            System.out.println("AVERAGE GRADE: " + list[i][6]);
            System.out.println("REMARKS: " + list[i][7]);
        }
        
        scanner.close();
    }
}

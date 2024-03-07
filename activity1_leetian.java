import java.util.Scanner;
import java.util.Arrays;

public class activity1_leetian {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //id, name, year & section, grade 1, grade 2, grade 3, grade 4, grade 5, total, marks
        String[][] list = new String[5][10];

        for (int i = 0; i < 5; i++){
            System.out.println("--------Student #" + i + "--------");
            System.out.print("Enter student #" + i + " id: ");
            list[i][0] = scanner.nextLine();
            System.out.print("Enter student #" + i + " name: ");
            list[i][1] = scanner.nextLine();
            System.out.print("Enter student #" + i + " year & section: ");
            list[i][2] = scanner.nextLine();
            System.out.print("Enter student #" + i + " grade for subject 1: ");
            list[i][3] = scanner.nextLine();
            System.out.print("Enter student #" + i + " grade for subject 2: ");
            list[i][4] = scanner.nextLine();
            System.out.print("Enter student #" + i + " grade for subject 3: ");
            list[i][5] = scanner.nextLine();
            System.out.print("Enter student #" + i + " grade for subject 4: ");
            list[i][6] = scanner.nextLine();
            System.out.print("Enter student #" + i + " grade for subject 5: ");
            list[i][7] = scanner.nextLine();
            float total = 0f;
            for (int j = 3; j < 8; j++){
                total += Float.parseFloat(list[i][j]);
            }
            total /= 5;
            list[i][8] = String.valueOf(total);
            if (total >= 3.1 && total <= 5){
                list[i][9] = "Failed";
            } else if (total >= 2.5 && total <= 3.0){
                list[i][9] = "Good";
            } else if (total >= 2.1 && total <= 2.4){
                list[i][9] = "Better";
            } else if (total >= 1.5 && total <= 2.0){
                list[i][9] = "Excellent";
            } else if (total >= 1.0 && total <= 1.4){
                list[i][9] = "Outstanding";
            }
        }

        System.out.println("The array looks like this:");
        System.out.println(Arrays.deepToString(list));
        
        System.out.println("\n\n\n");
        for (int i = 0; i < 5; i++){
            System.out.println("--------Student #" + i + "--------");
            System.out.println("Student ID:" + list[i][0]);
            System.out.println("Student Name:" + list[i][1]);
            System.out.println("Student Course and Year:" + list[i][2]);
            System.out.println("Student Semestral Average:" + list[i][8]);
            System.out.println("Remarks:" + list[i][9]);
            }
        scanner.close();
    }
}
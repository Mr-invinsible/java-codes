import java.util.Scanner;

public class P14_grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char grade;
        if (a>=90)
            grade = 'A';
        else if ((a<90)&&(a>=80)) {
            grade = 'B';
        }
        else
            grade = 'C';
        System.out.println("Grade = "+grade);
        sc.close();
    }
}

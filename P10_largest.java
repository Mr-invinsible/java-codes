import java.util.Scanner;

public class P10_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 inputs");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int big = a;
        if (big < b)
            big = b;
        if(big < c)
            big = c;
        System.out.println("the largest number is "+c);
    }
}

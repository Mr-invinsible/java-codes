import java.util.Scanner;

public class P4_even_odd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the value of a");
        a = sc.nextInt();
        if (a%2==0)
            System.out.println("it is even!");
        else
            System.out.println("it is odd!");
    }
}

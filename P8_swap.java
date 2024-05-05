import java.util.Scanner;

public class P8_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the value of a");
        a = sc.nextInt();
        System.out.println("enter the value of b");
        b = sc.nextInt();
        System.out.println("before swap:value of a = "+a+" value of b = "+b);
        c = a;
        a = b;
        b = c;
        System.out.println("after swap:value of a = "+a+" value of b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after double swap:value of a = "+a+" value of b = "+b);
    }
}

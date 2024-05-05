import java.util.Scanner;

public class P5_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,flag=0;
        System.out.println("enter the number");
        a = sc.nextInt();
        for(int i = 2;i<a;i++)
        {
            if(a%i==0){
                System.out.println("it is not a prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("it is a prime number");
        }
    }
}

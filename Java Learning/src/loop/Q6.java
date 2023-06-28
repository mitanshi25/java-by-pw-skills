package loop;
import java.util.Scanner;


/*
     given 2 numbers a and b, find a raise to the power b

     a = 2
     b= 5

     output = 32
 */

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no");

        int a= sc.nextInt();
        System.out.println("enter another no");

        int b = sc.nextInt();
        int ans = 1;

        for (int i = 1; i<=b; i++){

            ans = ans * a;
        }

        System.out.println(ans);
    }
}

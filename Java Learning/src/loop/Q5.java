package loop;
import java.util.Scanner;

/*
     find the factorial of a given no

     input: 5
     output- 120
 */
public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no");

        int num = sc.nextInt();
        int fact = 1;

        for (int i = 2; i<=num; i++){

            fact = fact*i;
        }

        System.out.println("factorial is: "+ fact);


    }
}

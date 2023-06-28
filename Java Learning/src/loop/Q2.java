package loop;
import java.util.Scanner;

/*
    find the sum of digits in a given no

    input - 12345
    output- 15


    input - 12
    output- 3
 */


public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int number = sc.nextInt();
        int sum_of_digits = 0;

        while (number>0){

            sum_of_digits = sum_of_digits+ (number%10);
            number = number/10;

        }

        System.out.println("Sum of digits in a number is: " + sum_of_digits);


    }
}

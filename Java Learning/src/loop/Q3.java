package loop;
import java.util.Scanner;
 /*
     reverse the digit of number

     input - 258
     outout - 852
  */
public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int number = sc.nextInt();
        int print_the_reverse_digit;

        while (number>0){

            print_the_reverse_digit = number%10;
            System.out.print(print_the_reverse_digit);
           number=  number/10;
        }



    }
}

package loop;
import java.util.Scanner;

/*count the no of digits for a given number
     input- 12345
     output- 5

     input- 345
     output- 3

 */

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        //created the copy of original inputed number
        int copy_number = number;
        int digits = 0;

        while (copy_number>0){
            copy_number = copy_number/10;
            digits++;

        }
        System.out.println("the no of digits for a given number:"+ number + " : " +digits);





    }
}

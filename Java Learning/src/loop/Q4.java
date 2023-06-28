package loop;
import java.util.Scanner;

/*
     find the output for the series

     s = 1-2+3-4+5..n

     here if a no is even then we are subtracting
     and if a no is add then we are adding

 */

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the no ");
        int number = sc.nextInt();
        int output =0;

        for (int i = 1; i<=number; i++){
            if (i%2==0){
                output = output-i;
            }
            else{
                output = output+i;
            }


        }
        System.out.println("The final answer is :" + output);



    }
}

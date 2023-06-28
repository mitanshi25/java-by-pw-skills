package numberSystem;

import java.util.Scanner;

/*
     conversion of binary to decimal

     input - 1001
     output - 9

     1*2^3 + 0*2^2 + 0*2^1 + 1*2^0
 */

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a binary no");

        int bin_no = sc.nextInt();

        int ans_of_decimal =0;
        int pw = 1; //represents 2^0 = 1


        int unit_digit;

        while(bin_no>0){

            unit_digit = bin_no%10;

            ans_of_decimal = ans_of_decimal+(unit_digit*pw);


            bin_no = bin_no/10;
            pw = pw*2;


        }
        System.out.println(ans_of_decimal);

    }
}

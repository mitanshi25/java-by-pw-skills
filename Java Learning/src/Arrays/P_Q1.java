package Arrays;
import java.util.Scanner;

//taking input form the user
public class P_Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the array");

        int n = sc.nextInt();

        //declare a array of size n

        int arr [] = new int[n];

        //taking the input in the array

        System.out.println("enter "+ n + "numbers to insert in a array");

        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        //printing the element of the array

        System.out.println("The numbers you entered in the array");

        for(int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

    }
}

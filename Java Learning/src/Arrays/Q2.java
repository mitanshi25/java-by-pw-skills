package Arrays;

/*
Calculate the maximum value out of all the elements of the array

input - arr[] = {1,5,3}
output - 5
 */

public class Q2 {

    public static void main(String[] args) {
        int arr[] = {1,5,3};

        int max = arr[0];

        for (int i = 1; i<arr.length; i++){

            if (max < arr[i]){
                max = arr[i];
            }


        }
        System.out.println("The maximum value is: "+ max);
    }
}

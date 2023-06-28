package Arrays;

// calculate the sum of all the elements of the array
//input- {1,5,3}
//output- 9

public class Q1 {

    public static void main(String[] args) {

        int arr [] = {1, 5, 3};
        int sum = 0;

        for (int i = 0; i<arr.length; i++){

            sum = sum + arr[i];

        }
        System.out.println("the sum od the array is: "+ sum);
    }

}

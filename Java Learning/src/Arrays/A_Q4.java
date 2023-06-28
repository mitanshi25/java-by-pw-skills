package Arrays;
/*

Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
for calculating the minimum element.
Output:
-4

 */

public class A_Q4 {
    public static void main(String[] args) {
        int arr []= {2, -3, 5, 8, 1, 0, -4};

        int min = arr[0];

        for (int i = 1; i<arr.length; i++){
            if (min>arr[i]){

                min = arr[i];
            }
        }
        System.out.println("The minimum value is: "+ min);
    }
}

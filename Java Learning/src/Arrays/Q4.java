package Arrays;

/*
 count the number of occurences of a particular number x in an array

 x= 5

 arr = {1,5,6,5,3,5}

 output = 3

 */

public class Q4 {
    public static void main(String[] args) {
        int x = 5;
        int count = 0;
        int arr [] = {1,5,6,5,3,5,8,5,5,5,5};
        for (int i =0; i< arr.length; i++){
            if (x==arr[i]){
                count++;
            }
        }
        System.out.println("The number of the occurence is: "+ count);
    }
}

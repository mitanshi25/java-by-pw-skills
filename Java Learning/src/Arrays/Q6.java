package Arrays;

/*
count the no of elements strictly greater than element x
 input = {1,5,6,6,7,6}
 x = 5

 output- 3
 */


public class Q6 {
    public static void main(String[] args) {

        int  arr [] = {1,5,6,6,7,6};
        int x = 5;
        int count = 0;

        for (int i =0; i< arr.length; i++){
            if (x+1 == arr[i]){

                count++;
            }
        }
        System.out.println(count);
    }
}

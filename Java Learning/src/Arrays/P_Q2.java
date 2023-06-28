package Arrays;

//Coping one array to another one



public class P_Q2 {

    static void printArray(int [] arr){

        for (int i = 0; i<arr.length; i++){

            System.out.println("the array is "+ arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};

        printArray(arr);

        int [] arr2 = arr;

        arr2[1]= 5;

        printArray(arr2);

        printArray(arr);


    }
}

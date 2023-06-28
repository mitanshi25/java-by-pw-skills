package Arrays;

//find the last occurence of an element x in an given array

public class Q5 {

    static void lastOccurenece(int [] arr, int x){
        for (int i = arr.length-1; i>=0; i--){
            if(x==arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,21,3,55,3,2,3};

        lastOccurenece(arr,21);

    }
}

package Arrays;

public class Q3 {
    public static void main(String[] args) {

        int arr []= {1,5,3,8,8};

        int x = 8;

        int ans = -1;

        /*  First Method

        for (int i =0; i<arr.length; i++){
            if (x==arr[i]){

                System.out.println(i);
                break;
            }
            else {

                System.out.println("-1");
            }


        }

         */


        for (int i = 0; i< arr.length; i++){
            if (x == arr[i]){

                ans = i;

                break;
            }

        }

        System.out.println("The index for "+ x + " is present at: "+ ans);
    }
}

package Arrays;

/*
Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
elements.
Output:
2
4
6
8
 */

public class A_Q3 {
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7,8};

        for (int a:arr)
              {

                  if (a%2==0){
                      System.out.println(a);
                  }

        }
    }
}

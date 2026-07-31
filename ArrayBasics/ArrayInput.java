package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    static void main(String[] args) {

        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        // using for each loop
//        for(int num:arr){// for every element in array,print the element
//            System.out.print(num+" ");// num represents element of the array
//        }
        // USING toString method
        System.out.println(Arrays.toString(arr));
    }
}

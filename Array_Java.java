// Array in java
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Java {
    public static void main(String[] args){
        int Arr[]={1,3,5,8,9,2,0}; //Array declaration with value
        // Output : [1, 3, 5, 8, 9, 2, 0]
        System.out.println(Arrays.toString(Arr));// Print the Array values in single line.
        int A[];// Declaring a Array
        A=new int[5]; // Allocate the memory to Array
        int B[]=new int [5]; //Declaring and allocate memory in single line.
        System.out.println(Arrays.toString(A));
        // Output : [0, 0, 0, 0, 0]
        Scanner val = new Scanner(System.in);
        int a;
        for (int i=0;i<5;i++){
            System.out.println("Enter the number : ");
            a=val.nextInt();
            A[i]=a;
        }
        System.out.println(Arrays.toString(A));
        /*
        Output :
                    Enter the number :
                    1
                    Enter the number :
                    3
                    Enter the number :
                    5
                    Enter the number :
                    2
                    Enter the number :
                    6
                    [1, 3, 5, 2, 6]
         */

    }
}


// Find the number of even and odd numbers in a Array :
import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args){
        System.out.println("Enter the limit : ");
        Scanner val=new Scanner(System.in);
        int n = val.nextInt();
        int arr[]=new int[n];
        int nums,e=0,o=0;
        for (int i=0;i<n;i++){
            System.out.println("Enter the Number : ");
            nums=val.nextInt();
            arr[i]=nums;
        }
        for(int value : arr){
            if(value%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        System.out.println("Even Numbers : "+e);
        System.out.println("Odd Numbers  : "+o);
    }
}
/*
                          Output :
                            Enter the limit :
                            5
                            Enter the Number :
                            2
                            Enter the Number :
                            3
                            Enter the Number :
                            5
                            Enter the Number :
                            1
                            Enter the Number :
                            6
                            Even Numbers : 2
                            Odd Numbers  : 3
 */

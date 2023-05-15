// Find the given number is perfect or not.
import java.util.Scanner;

public class Perfect {
    public static void main(String[] args){
        System.out.println("Enter a Number : ");
        Scanner val=new Scanner(System.in);
        int num=val.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num+" is a Perfect Number");
        }
        else{
            System.out.println(num+" is not a Perfect Number");
        }
    }
}
          /*        Output:
                    Enter a Number :
                    6
                    6 is a Perfect Number
           */
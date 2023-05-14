// Find the given number is Armstrong number or not.
import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        System.out.println("Enter 3 digit Number : ");
        Scanner val=new Scanner(System.in);
        int num=val.nextInt();
        int tem=num;
        int d1,d2,d3;
        d1=num%10;
        tem=num/10;
        d2=tem%10;
        tem=tem/10;
        d3=tem%10;
        int result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
        if(result==num){
            System.out.println(num+" is Armstrong Number.");
        }
        else{
            System.out.println(num+" is not a Armstrong Number.");
        }
    }
}
            /*  Output :
                Enter 3 digit Number :
                153
                153 is Armstrong Number.
            */

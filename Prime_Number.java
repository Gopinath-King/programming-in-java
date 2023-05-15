// Find the given number is prime Number or Not :
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args){
        System.out.println("Enter a Number : ");
        Scanner val=new Scanner(System.in);
        int num=val.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+" is not a Prime Number");
        }
    }
}
/*
                    Output :
                    Enter a Number :
                    5
                    5 is a Prime Number
*/
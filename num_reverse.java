// Reverse of N digit number :
import java.util.Scanner;

public class num_reverse {
    public static void main(String args[]){
        System.out.print("Enter the Number : ");
        Scanner val=new Scanner(System.in);
        int num=val.nextInt();
        int rev=0,rem;
        while(num!=0){
            rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        System.out.println("Reversed number  : "+rev);
    }
}
/*  Output :
Enter the Number : 758493
Reversed number  : 394857      */
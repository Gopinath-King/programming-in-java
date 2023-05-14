// factorial of given number :
import java.util.Scanner;

public class factorial {
    public static void main(String arg[]){
        System.out.print("Enter a number    : ");
        Scanner val=new Scanner(System.in);
        int lmt=val.nextInt();
        int fact=1;
        int i=1;
        // for(int i=1;i<=lmt;i++)
        while(i<=lmt){
            fact*=i;
            i++;
        }
        System.out.printf("Factorial of %d is : %d",lmt,fact);
    }
}
                     /* Output :
                        Enter a number    : 6
                        Factorial of 6 is : 720   */
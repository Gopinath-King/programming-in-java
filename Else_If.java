// Else if ladder    - Find grade with user input
import java.util.Scanner;

public class Else_If {
    public static void main(String args[]){
        System.out.println("Enter your average mark : ");
        Scanner val=new Scanner(System.in);
        float avg=val.nextFloat();
        if(avg<100 && avg>=85){
            System.out.println("Your grade is A");
        }
        else if (avg<85 && avg>=60){
            System.out.println("Your grade is B");
        }
        else if (avg<60 && avg>=35){
            System.out.println("Your grade is C");
        }
        else if (avg<35){
            System.out.println("You fail");
        }
        else{
            System.out.println("Invalid input");
        }
    }
} /* Output:
Enter your average mark :
70
Your grade is B */


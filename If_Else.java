// If else Statement
import java.util.Scanner;
// Find pass or fail mark with user input
public class If_Else {
        public static void main(String args[]){
            System.out.println("Enter your average mark : ");
            Scanner val =new Scanner(System.in);
            float avg=val.nextFloat();
            if(avg>35) {
                System.out.println("This is pass mark");
            }
            else {
                System.out.println("This is fail mark");
            }
        }
    }    /*
    Output:
Enter your average mark :
100
This is pass mark */



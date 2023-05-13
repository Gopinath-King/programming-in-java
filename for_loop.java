// for loop
import java.util.Scanner;

public class for_loop {
    public static void main(String args[]){
        System.out.printf("Enter the limit : ");
        Scanner val = new Scanner(System.in);
        int lmt;
        lmt=val.nextInt();
        for(int i=1;i<=lmt;i++){            // Entry controlled loop
            System.out.printf("Value of i : "+i+"\n");
        }
    }
}/*                Output:
                            Enter the limit : 6
                            Value of i : 1
                            Value of i : 2
                            Value of i : 3
                            Value of i : 4
                            Value of i : 5
                            Value of i : 6
*/

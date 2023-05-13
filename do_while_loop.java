// do while loop
import java.util.Scanner;

public class do_while_loop { // Exit controlled loop
    public static void main(String arg[]){
        System.out.printf("Enter the limit : ");
        Scanner val =new Scanner(System.in);
        int lmt,i=1;
        lmt=val.nextInt();
        do{
            System.out.printf("Value of i : "+i+"\n");
            i++;
        }while(i<=lmt);
    }
}
/*                  Output:
                    Enter the limit : 5
                    Value of i : 1
                    Value of i : 2
                    Value of i : 3
                    Value of i : 4
                    Value of i : 5
 */
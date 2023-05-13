// while loop
import java.util.Scanner;

public class while_loop {
    public static void main(String arg[]){
        System.out.printf("Enter the Limit : ");
        Scanner val =new Scanner(System.in);
        int limit,i=1;
        limit=val.nextInt();
        while(i<=limit){    //Entry controlled loop
            System.out.printf("value of i : "+i+"\n");
            i++;
        }
    }
}
/*
        Output:
        Enter the Limit : 5
        value of i : 1
        value of i : 2
        value of i : 3
        value of i : 4
        value of i : 5
*/

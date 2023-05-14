// Print Multiplication table until the given limit :
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] arg){
        System.out.println("Enter the table : ");
        Scanner val=new Scanner(System.in);
        int t=val.nextInt();
        System.out.println("Enter the Limit : ");
        int lmt=val.nextInt();
        for(int i=1;i<=lmt;i++){
            System.out.println(i+" X "+t+" = "+(t*i));
        }
    }
}
/*              Output :
                Enter the table :
                2
                Enter the Limit :
                5
                1 X 2 = 2
                2 X 2 = 4
                3 X 2 = 6
                4 X 2 = 8
                5 X 2 = 10
 */
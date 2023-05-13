// Nested for loop
import java.util.Scanner;

public class Nested_for {
    public static void main(String arg[]){
        System.out.println("Enter the Limit : ");
        Scanner val=new Scanner(System.in);
        int lmt=val.nextInt();
        for(int i=1;i<=lmt;i++){
            for(int j=1;j<=i;j++){
                System.out.print("::");
            }
            System.out.printf("\n");
        }
    }
}
  /*    Output:
        Enter the Limit :
        6
        ::
        ::::
        ::::::
        ::::::::
        ::::::::::
        ::::::::::::           */
// Febonacci series in java
import java.util.Scanner;

public class fibonacci {
    public static void main(String arg[]){
        System.out.print("Enter the limit : ");
        Scanner val=new Scanner(System.in);
        int lmt=val.nextInt();
        int a=-1,b=1,c;
        for(int i=1;i<=lmt;i++){
            c=a+b;
            System.out.printf("%d    ",c);
            a=b;
            b=c;
        }
    }
}
                    /*
                    Enter the limit : 8
                    0    1    1    2    3    5    8    13
                    Process finished with exit code 0
                     */
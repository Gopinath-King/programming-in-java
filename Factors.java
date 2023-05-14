// Find the factors of given number :
import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        System.out.println("Enter a number : ");
        Scanner val=new Scanner(System.in);
        int num=val.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+"  ");
            }
        }
    }
}
        /*  Output :
            Enter a number :
            8
            1  2  4  8        */
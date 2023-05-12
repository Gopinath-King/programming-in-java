// Get input from user
import java.util.Scanner;

public class get_input {
    public static void main(String args[]){
        Scanner val =new Scanner(System.in);
        int a,b;
        System.out.println("Enter your name :");
        String name;
        name = val.next();
        System.out.println("Enter two numbers:");
        a = val.nextInt();
        b = val.nextInt();
        System.out.println("Your name is       : "+name);
        System.out.println("Addition is ("+a+"+"+b+"): "+(a+b));
    }
}          /* Output:
            Enter your name :
            Gopinath
            Enter two numbers:
            10
            20
            Your name is       : Gopinath
            Addition is (10+20): 30
  */

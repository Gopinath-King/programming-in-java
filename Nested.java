import java.util.Scanner;

public class Nested {
    public static void main(String arg[]){
        System.out.println("Enter your gender :");
        Scanner val=new Scanner(System.in);
        char gen=val.next().charAt(0);
        if(gen=='m'||gen=='M'){
            System.out.println("Enter your age :");
            int age=val.nextInt();
            if(age<20){
                System.out.println("Boy");
            }
            else{
                System.out.println("Man");
            }
        }
        else if(gen=='f'||gen=='F'){
            System.out.println("Enter your age :");
            int age=val.nextInt();
            if(age<20){
                System.out.println("Girl");
            }
            else{
                System.out.println("Woman");
            }
        }
        else{
            System.out.println("Invalid input...!(Ex: male or female)");
        }
    }
}
           /*   Output
                Enter your gender :
                male
                Enter your age :
                18
                Boy                 */
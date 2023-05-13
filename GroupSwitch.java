//
import java.util.Scanner;

public class GroupSwitch {
    public static void main(String arg[]){
        System.out.println("Enter month's Number : ");
        Scanner val=new Scanner(System.in);
        int mon;
        mon=val.nextInt();
        switch(mon){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                System.out.println("31 Days");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:{
                System.out.println("30 Days");
                break;
            }
            case 2:{
                System.out.println("28 Days");
                break;
            }
            default: {
                System.out.println("Invalid Input....");
            }
        }
    }
}
/*
Enter month's Number :
5
31 Days
*/
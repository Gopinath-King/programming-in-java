import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner val=new Scanner(System.in);
        int num=val.nextInt();
        int temp=num,i;
        int rem;
        int sum=0;
        while(num>0){ //
            rem=num%10;//5 4
            int fact=1;
            for(i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            //fact=1;
            num/=10;//14
        }
        if(sum==temp){
            System.out.println(temp+" is a Strong Number ");
        }
        else{
            System.out.println(temp+" is not a Strong Number ");
        }
    }
}
             /* Output
                Enter a number :
                145
                145 is a Strong Number
             */
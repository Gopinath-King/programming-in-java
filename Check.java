import java.util.Scanner;

public class Check {
    public static void main(String[] args ){
        System.out.print("Enter a sentence : ");
        Scanner val = new Scanner(System.in);
        String str;
        str = val.nextLine();
        System.out.println(str);
        int cap = 0, small = 0 , num = 0 , sym = 0 ,space = 0;
        for ( int i=0 ; i<str.length() ; i++ ) {
            if (str.charAt(i)>64 && str.charAt(i)<91) {
                cap++;
            }
            if ( str.charAt(i)>96 && str.charAt(i)<123){
                small++;
            }
            if(str.charAt(i)>47 && str.charAt(i)<59){
                num++;
            }
            if ( str.charAt(i)==32){
                space ++;
            }
        }
        System.out.println("Total num of capital letters : "+ cap);
        System.out.println("Total num of small letters   : "+ small);
        System.out.println("Total num of numbers         : "+ num);
        System.out.println("Total num of symbols         : "+ (str.length()-(space+cap+small+num)));
        System.out.println("Total num of space           : "+ space);

    }
}

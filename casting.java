// Type Casting 1. Widening 2. Narrowing
import java.lang.*;
public class casting {
    public static void main(String args[]){
        // Widening Casting
        int a=30;
        double b=a;
        // Narrowing Casting
        double c=30.555;
        //int d=c; Error: incompatible types: possible lossy conversion from double to int
        int d=(int)c;
        System.out.println("Widening Casting");
        System.out.println("Integer : "+a);
        System.out.println("Double  : "+b);
        System.out.println("Narrowing Casting");
        System.out.println("Double  : "+c);
        System.out.println("Integer : "+d);
    }
}        /* Output:
            Widening Casting
            Integer : 30
            Double  : 30.0
            Narrowing Casting
            Double  : 30.555
            Integer : 30      */

/* Unary Operators   ++ , --
*  Increment and Decrement Operator
*  1. post increment or decrement
*  2. pre increment or decrement   */
public class unary {
    public static void main(String args[]){
        int a=5;
        System.out.println("a= "+a); // a=5
        int b=a++;
        System.out.println("b : "+b+" a : "+a); // b = 5  a = 6
        System.out.println("a= "+ ++a);  // a=7
        System.out.println("a= "+a++);   // a=7
        System.out.println("a= "+a);     // a=8
        System.out.println("a= "+ --a); // a=7
    }
}

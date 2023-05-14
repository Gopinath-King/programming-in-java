// Find Armstrong numbers between 100 to 1000 :
public class Armstrong_Numbers {
    public static void main(String []arg){
        int tem;
        int d1, d2, d3;
        for(int i=100;i<1000;i++) {
            tem = i;
            d1 = i % 10;
            tem = i / 10;
            d2 = tem % 10;
            tem = tem / 10;
            d3 = tem % 10;
            int result = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);
            if (result == i) {
                System.out.println(i + " is Armstrong Number.");
            }
        }
    }
}
/*              Output :
                153 is Armstrong Number.
                370 is Armstrong Number.
                371 is Armstrong Number.
                407 is Armstrong Number.
*/
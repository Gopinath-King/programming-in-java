// print Prime Numbers from 1 to 20 :
public class Prime_Nums {
    public static void main(String[] arg){
        int count=0;
        for(int n=1;n<=20;n++){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(n+" is Prime Number");
            }
            count=0;
        }
    }
}
/*                  Output :
                    2 is Prime Number
                    3 is Prime Number
                    5 is Prime Number
                    7 is Prime Number
                    11 is Prime Number
                    13 is Prime Number
                    17 is Prime Number
                    19 is Prime Number
*/
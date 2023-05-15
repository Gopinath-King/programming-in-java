// Ascending Order
import java.util.Arrays;
public class AscendingOrder {
    public static void main(String args[]){
        int arr[]={3,6,98,29,49,21,8,12};
        int temp;
        System.out.println("Before Sort : ");
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            for ( int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sort : ");
        System.out.println(Arrays.toString(arr));
    }
}
                 /* Output :
                    Before Sort :
                    [3, 6, 98, 29, 49, 21, 8, 12]
                    After sort :
                    [3, 6, 8, 12, 21, 29, 49, 98]
                 */
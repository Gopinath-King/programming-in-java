// insert a element to Array ( A specific Index )  :
import java.lang.*;
import java.util.Arrays;

public class Insert_element {
    public static void main(String[] args){
        int arr[]={49,29,10,30,38,83,73,99};
        System.out.println("Before Insert   : "+ Arrays.toString(arr));
        int index=3;
        int insert=50;
        for ( int i=arr.length-1; i>index; i-- ) {
            arr[i]=arr[i-1];
        }
        arr[index]=insert;
        System.out.println("After Insertion : "+Arrays.toString(arr));
    }
}
/*          Output :
            Before Insert   : [49, 29, 10, 30, 38, 83, 73, 99]
            After Insertion : [49, 29, 10, 50, 30, 38, 83, 73]

 */
// Find duplicate numbers in a array :
public class Duplicate_Number {
    public static void main(String[] args){
        int arr[]={2,5,6,2,7,8,7,5};
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Number : "+arr[i]);
                }
            }
        }
    }
}
/*
                    Output :
                    Duplicate Number : 2
                    Duplicate Number : 5
                    Duplicate Number : 7
*/
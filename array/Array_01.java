package array;
public class Array_01 {
    public static int largeNumber(int arr[]){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={1,6,3,2,9};
        System.out.println(largeNumber(arr));
    }
}

package array;

public class Array_08 {
    public static void kadanes(int arr[]){
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(maxsum,currsum);
        }
        System.out.print(maxsum);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);

    }
}

package array;

public class Array_06 {
    public static void Maxsum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                int currsum=0;
                for (int k = start; k <= end; k++) {
                   currsum+=arr[k];
                }
               /*if(maxsum<currsum){
                   maxsum=currsum;
               }*/
               maxsum=Math.max(maxsum,currsum);
            }


        }
       System.out.println("Maximum sum is:"+ maxsum);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        Maxsum(arr);
    }
}

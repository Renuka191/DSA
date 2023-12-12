package array;

public class Array_07{
    public static void prifix(int arr[]){
        int prifixx[]=new int[arr.length];
        prifixx[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prifixx[i]=arr[i]+prifixx[i];
        }
        int maxsum=Integer.MIN_VALUE, currsum=0;
        for (int i = 0; i < arr.length; i++) {
            int start =i;
            for (int j = i; j < arr.length; j++) {
                  int end=j;
                  currsum= start==0 ? prifixx[end] : prifixx[end]-prifixx[start-1];
                  if(maxsum<currsum){
                      maxsum=currsum;
                  }
            }
            
        }
        System.out.println("maximum sum :"+maxsum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        prifix(arr);
    }
}

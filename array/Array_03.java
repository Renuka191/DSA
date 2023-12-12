package array;

public class Array_03 {
    public static void  reverse_array(int arr[]){
        int start =0,end=arr.length-1;
        while(start<end) {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        reverse_array(arr);
        System.out.println("reverse array is:"+"\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+" ");
        }


    }
}

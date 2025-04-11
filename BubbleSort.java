import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{8,5,1,2,6};
        // bubbleSort(arr,0,arr.length-1);
        // System.out.println(Arrays.toString(arr));
        selectionSort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    private static  void bubbleSort(int[] arr,int start,int end){
        if(end==0) return ;
        if(start<end){
            if(arr[start]>arr[start+1]){
                int temp=arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            bubbleSort(arr, start+1, end);
        }else{
            bubbleSort(arr, 0, end-1);
        } 
    }
    private static void selectionSort(int[] arr,int start,int end,int max){
        if(end==0){
            return;
        }
        if(start<end){
            if(arr[start]>arr[max]){
                
                selectionSort(arr, start+1, end,start );
            }
            else{

                selectionSort(arr, start, end-1,max );
            }
        }
        else{
            int temp=arr[start];
            arr[start]=arr[start+1];
            arr[start+1]=temp;
            selectionSort(arr, start-1, 0, 0);
        }
    }
}

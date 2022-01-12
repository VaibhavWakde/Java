package java_task.find_min_max;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {10,11,31,4,5,6,7,8,9};
        int size = arr.length;
        int max = arr[0];



        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

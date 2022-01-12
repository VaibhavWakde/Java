package java_task.find_min_max;

public class FindMini {
    public static void main(String[] args) {
        int[] arr = {10,11,31,4,5,6,7,8,9};
        int size = arr.length;
        int small = arr[0];



        for(int i=0;i<size;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}

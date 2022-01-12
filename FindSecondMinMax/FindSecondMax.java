package java_task.FindSecondMinMax;

public class FindSecondMax {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};

        int a = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[a]){
                a=arr[i];
            }
        }
        System.out.println(a);
    }
}

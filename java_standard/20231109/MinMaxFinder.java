package model2;

public class MinMaxFinder {
    private MinMaxFinder(){}
    public static int findMin(int[] arr){
        int min=arr[0];//
        for(int i=1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max=arr[0];//
        for(int i=1;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

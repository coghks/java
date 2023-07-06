package greedy.real;
import java.util.*;
public class greedyreal1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for (int i=0;i<n;i++){      // 5    2 3 1 2 2
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); //12223
        int num=arr.length;
        while(true){
            int a=num-arr[n-1];
            if (a<=0){
                count++;
                break;
            }
            count++;
            int[] arr1=Arrays.copyOfRange(arr,0,a);
            num=arr1.length;

        }
        System.out.println(count);
    }
}

package greedy.real;
import java.util.*;
public class greedyreal5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); //1 3 2 3 2
        }
        int count=0;


        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]!=arr[j])count++;

            }

        }
        System.out.println(count);
    }
}

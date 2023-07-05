import java.lang.reflect.Array;
import java.util.*;
public class greedy1r {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        sum+=(m/(k+1))*((k*arr[n-1])+arr[n-2])+(m%(k+1))*arr[n-1]; //처음 풀었을 땐 반복문이었었는데 수열의 규칙을 찾아 식으로 바꿈 시간복잡도 감소
        System.out.println("sum = " + sum);
    }
}

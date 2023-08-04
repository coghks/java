import java.util.*;

public class p1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int j=0; j<n; j++){
            a[j] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            b[j] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i] * b[n-i-1];
        }
        System.out.println(sum);
    }
}
//그리디 1026
//1.n과 a,b배열을 받는다
//2.a,b배열 각각 오름차순 정리
//3.sum에 a는 오름차순으로  b는 내림차순으로 곱한 값을 모두 더함

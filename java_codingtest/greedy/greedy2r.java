import java.util.*;
public class greedy2r {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int result=0;
        for(int i=0;i<n;i++){
            int minv=10001;//10000이 최대이므로
            for(int j=0;j<m;j++){
                int x=sc.nextInt();
                minv=Math.min(x,minv);

            }
            result=Math.max(minv,result);
        }
        System.out.println(result);
    }
}
//Math라이브러리 사용으로 인해 코드 길이 감소

import java.util.*;
public class greedy2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] arr=new int[n][m];
        int[] ans=new int[n];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
            Arrays.sort(arr[i]);
            ans[i]=arr[i][0];
        }
        Arrays.sort(ans);
        System.out.println(ans[n-1]);

    }
}

import java.util.*;

public class p11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] p =new int [n];
        for (int j=0; j<p.length; j++){
            p[j] = sc.nextInt();
        }
        int sum = 0;
        int total = 0;
        Arrays.sort(p);
        for(int i=0; i<p.length; i++){
            sum+=p[i];
            total+=sum;
        }
        System.out.println(total);
    }
}
//그리디 11399
//        1. int 배열로 받기
//        2. 오름차순 정리
//        3. sum에 저장 후 total에 계속 더하기

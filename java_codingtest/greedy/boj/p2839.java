import java.util.*;
public class p2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;


        while(true){
            if (n%5 == 0){
                count += n/5;
                System.out.println(count);
                break;
            }

            n-=3;
            count++;
            if (n%5 == 0){
                count += n/5;
                System.out.println(count);
                break;
            }
            if (n == 0){
                System.out.println(count);
                break;
            }
            if (n < 0){
                System.out.println(-1);
                break;
            }
        }

    }
}
//그리디 2839번
//        1.정수 n을 받음(3<n<5000)
//        2.5로 나누어 지는경우
//       3으로 나누어 지는경우
//        둘다 아닌 경우

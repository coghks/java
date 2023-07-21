import java.util.*;
public class p11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int count =0;
        int n = sc.nextInt();
        int total = sc.nextInt();
        int [] a = new int[n];
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for (int j=a.length-1; j>=0; j--){
            if (total/a[j] != 0){
                c = j;
                break;
            }
        }
        int[] a1 = Arrays.copyOfRange(a,0,c+1);
        for(int k=a1.length-1; k>=0; k--){
            count += total/a1[k];
            total = total%a1[k];
            if(total == 0)break;

        }
        System.out.println(count);

    }
}
//그리디11047
//        1.동전 개수와 만들어야 하는 돈을 저장함
//        2.동전 종류를 int[]에 저장
//        3.for문을 돌림
//        4.각 원소로 나누었을때 몫이 0이 아닌경우부터 슬라이싱
//        5.그 배열을 가지고 큰수부터 나누어 가면서 몫을 카운트에 저장하고 출력
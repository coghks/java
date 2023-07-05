import java.util.*;
public class greedy3r {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        while(true){
            int a=(n/k)*k;  //n과 가장 가까운 k의 배수를 찾음
            count+=n-a;     //1씩 빼는게 아니라 한 번에 빼서 뺀 만큼 스택 증가
            n=a;
            n/=k;           //k의 배수가 되었기 때문에 k로 나누어줌
            count++;        //나누어 준 행위 1스택 증가
            if(n<k) break;  //n이 k보다 작아지게 되면 위 과정을 반복할 수가 없으므로 while문 탈출
        }
        count+=n-1; //위 과정을 거치면 n이 1또는 2이므로 n-1을 통해 스택 증가(1이면 0스택 2이면 1스택)
        System.out.println(count);
    }
}
//이렇게 코드를 짜게 되면 n이 매우 커지게 되더라도 시간 복잡도가 증가하지 않음
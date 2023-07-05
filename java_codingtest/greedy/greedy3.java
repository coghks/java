import java.util.*;
public class greedy3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        while(n!=1){ //n=1이 되면 끝냄
            if (n%k==0){ //n이 k로 나누어지면 k로 나누고 count 1증가
                n=n/k;
                count++;
            }
            else{ //나누어지지 않으면 n을 1씩 뺌
                n--;
                count++;
            }
        }
        System.out.println(count);
    }
}
//정상 작동하나 n의 크기가 매우 커지게 되면 시간 복잡도도 매우 커짐
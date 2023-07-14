package gu_hyeon.real;
import java.util.*;
public class gu_hyeonreal1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int l=0,r=0;
        for(int i=0;i<n.length();i++){

            if(i<n.length()/2){
                l+=(int)(n.charAt(i)-48);
                continue;
            }
            r+=(int)(n.charAt(i)-48);;
        }
        if (l==r) System.out.println("LUCKY");
        else System.out.println("READY");

    }
}
//1.첫째 줄에 점수 n이 정수로 주어짐 자리수는 짝수개
//2.왼쪽 오른쪽으로 나누어 각각 더해서 같으면 LUCKY 다르면 READY
//n을 정수로 받은 다음 String로 변환
//charAt()를 이용해 각 자리수 구한다음 -48하고 int변환
//다 더한 후 비교

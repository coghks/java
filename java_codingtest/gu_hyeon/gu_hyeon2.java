package gu_hyeon;
import java.util.*;
public class gu_hyeon2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<60;j++){
                for(int k=0;k<60;k++){
                    if(i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3)c++;
                }
            }
        }
        System.out.println(c);
    }
}
//처음에 그냥 3만 들어가면 된다고 생각해서 i,j,k==3으로 풀어서 굉장히 많은 케이스들이 빠졌다.
//13,33등등 값 자체가 3이 아니라 10으로 나눈 나머지와 몫이 3인경우를 전부 다 포함해줘야함

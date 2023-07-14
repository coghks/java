package gu_hyeon.real;
import java.util.*;
public class gu_hyeonreal2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] c=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        Arrays.sort(c);
        String s1="";
        int sum=0;
        for(int i=0;i<c.length;i++){
            if(Character.getNumericValue(c[i])<=9){
                sum+=Character.getNumericValue(c[i]);
            }
            else s1+=c[i];
        }
        s1+=sum;
        System.out.println(s1);

    }
}
//1.문자열 s받음
//2.char[]에 각각 하나씩 저장
//3.sort
//4.57(9)이하면 다 더함(sum) 아니면 s1에 +함
//5.마지막에 sum도 s1에 +함

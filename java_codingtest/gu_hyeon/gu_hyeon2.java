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

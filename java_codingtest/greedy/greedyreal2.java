package greedy.real;
import java.util.*;
public class greedyreal2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=0;

        if (s.length()==1) System.out.println(s.charAt(0)-'0');

        else if ((s.charAt(0)-'0')<=1||(s.charAt(1)-'0')<=1){
            sum=(s.charAt(0)-'0')+(s.charAt(1)-'0');
            for (int i=2;i<s.length();i++){

                if ((s.charAt(i)-'0')<=1){
                    sum+=(s.charAt(i)-'0');
                    continue;
                }
                sum*=(s.charAt(i)-'0');
            }
            System.out.println(sum);
        }else{
            sum=((s.charAt(0)-'0')*(s.charAt(1)-'0'));
            for (int i=2;i<s.length();i++){

                if ((s.charAt(i)-'0')<=1){
                    sum+=(s.charAt(i)-'0');
                    continue;
                }
                sum*=(s.charAt(i)-'0');
            }
            System.out.println(sum);
        }




    }
}


package gu_hyeon;
import java.util.*;
public class gu_hyeon1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();//버퍼 지우기
        String[] plans=sc.nextLine().split(" ");
        int x=1,y=1;
        int nx=0,ny=0;

        int[] dx={0,0,-1,1};
        int[] dy={-1,1,0,0};
        char[] move_types={'L','R','U','D'}; //String 참조형 배열이 아닌 기본형 배열로 받아야 값을 비교할 수 있따. 


        for (int i=0;i<plans.length;i++){
            char plan=plans[i].charAt(0); //참조형 배열에는 값 자체가 아닌 주소가 저장되어 있으므로 비교를 위해선 char로 바꿔줘야함
            for (int j=0;j< move_types.length;j++){
                if(move_types[j]==plan){
                    nx=x+dx[j];
                    ny=y+dy[j];

                }
            }
            if (nx<1||ny<1||nx>n||ny>n)continue;
            x=nx;
            y=ny;

        }
        System.out.println(x+"\t"+y);
    }
}

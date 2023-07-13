package gu_hyeon;
import java.util.*;
public class gu_hyeon3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=(int)(s.charAt(0)-96);
        int y=(int)(s.charAt(1)-48);
        int[] dx={2,2,-2,-2,1,1,-1,-1};
        int[] dy={1,-1,1,-1,2,-2,2,-2};
        int nx=0,ny=0;
        int count=0;
        for(int i=0;i<8;i++){
            nx=x+dx[i];
            ny=y+dy[i];
            if(nx<1||nx>8||ny<1||ny>8){
                continue;
            }
            count++;


        }
        System.out.println(count);
    }
}
//1.문자열 입력받기 a1
//2.a=1 1=1로 바꿔서 (1,1)로 변환  a-96, 1-48 >>아스키 코드
//3.(2,1),(2,-1),(-2,1),(-2,-1),(1,2),(1,-2),(-1,2),(-1,-2)
//다 더해보면서 각 x좌표 y좌표 각각이 1미만 8초과가 되는지 확인
//정상 범위 내라면 count에 1씩 더하기
//문자열 저장 s, 변환된 좌표 x,y, 움직일 좌표 dx,dy, 움직이고 나서 좌표 nx,ny, 경우의 수 count
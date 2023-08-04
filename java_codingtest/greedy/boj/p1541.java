import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p1541{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE; //초기 상태 여부 확인을 위한 값
        StringTokenizer subtraction = new StringTokenizer(br.readLine(),"-");

        while (subtraction.hasMoreTokens()){
            int temp = 0;

            //뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(),"+");

            //덧셈으로 나뉜 토큰들을 모두 더한다.
            while (addition.hasMoreTokens()){
                temp += Integer.parseInt(addition.nextToken());
            }

            //첫번째 토큰일 경우 temp값이 첫 번째 수가 됨
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else{
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}

//그리디 1541(못품)(BufferedReader, StringTokenizer을 사용해보았음)
//1.전체를 문자로 저장
//2.-연산자라면 다음 -가 나오기 전까지 괄호로 묶음(-나온 다음 인덱스에 (추가하고 끝날때 괄호닫기
//3.0이 먼저 나오는 경우? boolean변수를 하나 둬서 0이 아닌수가 먼저 나왔을때 true 아닐
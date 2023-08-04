import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sBuilder = new StringBuilder();
        int count = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)>='A' && s.charAt(i)<='z'){ //문제의 요놈때문에 A와 z가 포함되면 테스트 실패했었음
                if (count % 2 == 0 && (int)s.charAt(i)>90){
                    sBuilder.append((char)(s.charAt(i)-32));
                    count++;

                }
                else if (count % 2 == 0 && (int)s.charAt(i)<=90){
                    sBuilder.append(s.charAt(i));
                    count++;

                }
                else if (count % 2 == 1 && (int)s.charAt(i)>90){
                    sBuilder.append(s.charAt(i));
                    count++;

                }
                else if (count % 2 == 1 && (int)s.charAt(i)<=90){
                    sBuilder.append((char)(s.charAt(i)+32));
                    count++;

                }
            }

            else{
                sBuilder.append(s.charAt(i));
                count = 0;
            }
        }
        String answer = sBuilder.toString();
        return answer;
    }
}
//프로그래머스 12930번(테스트케이스 몇개는 성공 몇개는 실패하는데 이유를 모르겠음..) --> A와 z를 빼먹었음!
//1.문자열 s를 받는다.
//2.공백을 기준으로 각 단어의 짝수 번째 알파벳은 대문자로 홀수 번째 알파벳은 소문자로 출력
//3.count를 만들어 각자리수가 짝수인지 홀수인지 판별 공백이 나오게 되면 count는 0으로 초기화
//4.StringBuilder 클래스를 이용해 바뀐 알파벳을 붙인 다음 다하면 출력

import java.util.*;
class Solution {
    public String solution(String s, int n) {
        StringBuilder sBuilder = new StringBuilder();
        for (char c : s.toCharArray()){
            if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) sBuilder.append(c);
            else{
                if(c >= 'A' && c <= 'Z'){
                    c =(char)(c + n);
                    if (c > 'Z') c = (char)(c - 25);
                    sBuilder.append(c);
                }
                if(c >= 'a' && c <= 'z'){
                    c =(char)(c + n);
                    if (c > 'z') c = (char)(c - 25);
                    sBuilder.append(c);
                }

            }
        }
        String answer = sBuilder.toString();
        return answer;
    }
}
//프로그래머스 12926번
//1.문자열 s와 정수 n을받음
//2.하나씩 확인해서 알파벳인 경우에 n만큼 미룸 알파벳이 아니라면 그대로 붙임
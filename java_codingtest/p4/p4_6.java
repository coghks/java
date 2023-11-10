// 직접 순회했을때
public class Solution {
    public boolean solution(String s) {
        int p = 0;
        int y = 0;
        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') {
                p++;
            } else if (c == 'y' || c == 'Y') {
                y++;
            }
        }
        return p == y;
    }
}


//다른 방법
public class Solution{
    boolean solution(String s){
        s = s.toLowerCase();

        int ps = s.length() - s.replace("p","").length();
        int ys = s.length() - s.replace("y","").length();
        return ps == ys;
    }
}
//1. 문자열을 모두 소문자로 변환
//2."p"의 개수 세기
// a. 문자열에 등장하는 모든 "p"를 빈 문자열 ""로 치환
// b. 원본 문자열과 변환된 문자열의 길이 차이가 p의 개수
//3. 2와 같은 방식으로 y의 개수 세기
//4. 구한 p의 개수와 y의 개수 비교
//https://school.programmers.co.kr/learn/courses/30/lessons/12916

//향상된 case문

public class Solution {
    public boolean solution(String s) {
        int p = 0;
        int y = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'p','P' -> p++;
                case 'y','Y' -> y++;
                
            }
        }
        return p == y;
    }
}







      
        



        



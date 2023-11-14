// 정규 표현식 이용
public class Solution{
    public boolean solution(String s){
        return s.matches("[0-9]{4}|[0-9]{6}");
    }
}

// 내장 라이브러리 이용
public class Solution{
    public boolean solution(String s){
        if (s.length() != 4 && s.length() != 6) return false;

        for (char c : s.toCharArray()){
            if(!Character.isDigit(c)) return false;
        }

        return true;
    }
}

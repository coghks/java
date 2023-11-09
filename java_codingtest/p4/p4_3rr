import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> split(String source, int length) { //split메서드 선언
        List<String> tokens = new ArrayList<>();
        for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
            int endIndex = startIndex + length;
            if (endIndex > source.length()) endIndex = source.length(); //잘라내는 index가 문자열 범위 밖일경우 정상적으로 잘릴 수 있게 처리
            tokens.add(source.substring(startIndex, endIndex));
            // 문자열을 startIndex부터 잘라 tokens 리스트에 추가
        }
        // source를 length만큼씩 잘라 tokens 리스트에 추가
        return tokens;
    }

    private int compress(String source, int length) {
        StringBuilder builder = new StringBuilder();
        String last = ""; // 직전에 등장한 문자열을 담는 변수
        int count = 0; // 등장 횟수를 담는 변수
        for(String token : split(source,length)){
            // 압축 문자열 구성
            if (token.equals(last)){
                count++;
            }else{
                if (count > 1) builder.append(count);
                builder.append(last);
                last = token;
                count = 1;
                // 새로운 토큰 등장 처리
            }
        }
        if(count > 1) builder.append(count);
        builder.append(last); // 마지막 token도 붙여줌

        return builder.length();
    }
        // 압축한 문자열의 길이 변환
    public int solution(String s){
        int min = Integer.MAX_VALUE;
        for(int length = 1; length <= s.length(); length++) {
            int compressed = compress(s,length);
            if (compressed <min){
                min = compressed;
            }
            //문자열 압축 후 가장 짧은 길이 선택
        }
        return min;

    }
}
//1. 1부터 입력 문자열 s의 길이만큼 자를 문자열의 길이를 설정하며 반복
//2. 설정된 길이만큼 문자열을 잘라 낸 token의 배열 생성
//3. 문자열을 비교하며 token의 배열을 하나의 문자열로 압축
//4. 1~3 과정으로 압축된 문자열 중 가장 짧은 길이 반환

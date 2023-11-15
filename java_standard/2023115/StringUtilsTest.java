package course.part2;

import model2.Converter;
import model2.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        // 인스턴스 메서드 참조
        Converter<String, String> converter = stringUtils::reverse;
        String result = converter.convert("hello");
        System.out.println("result = " + result);

    }

}

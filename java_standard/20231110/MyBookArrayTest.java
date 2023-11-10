package course.part1;

import model2.Book;
import model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        // 책 3권의 데이터를 배열에 저장하고 출력
        BookArray list = new BookArray(); // 책, 길이 5
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("c++",15000,"한빛","홍길동"));
        list.add(new Book("파이썬",15000,"한빛","홍길동"));

        Book vo = list.get(0);
        System.out.println(vo);
        vo = list.get(1);
        System.out.println(vo);
        vo = list.get(2);
        System.out.println(vo);
    }
}

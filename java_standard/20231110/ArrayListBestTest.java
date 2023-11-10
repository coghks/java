package course.part1;

import model2.Book;

import java.util.*;

public class ArrayListBestTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요.
        List<Book> list = new ArrayList<Book>(); // 기본크기 10
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("c++",15000,"한빛","홍길동"));
        list.add(new Book("파이썬",15000,"한빛","홍길동"));

        Book vo = (Book)list.get(0); // Book < (Book)Object
        System.out.println(vo.toString());

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i)); // Object > Book(JVM에서 자동으로 Book의 toString())
        }


    }
}

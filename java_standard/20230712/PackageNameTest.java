package fc.java.part3;
//import java.lang.*; default package
import fc.java.model.*;

import java.util.Scanner;

public class PackageNameTest {
    public static void main(String[] args) {
        //지금까지 자바에서 제공해줘서 사용해본 클래스들의 이름을 적어보자
        String str;
        Scanner scan=new Scanner(System.in);
        System.out.println("hello world");
        //우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자
        CarDTO car=new CarDTO();
        CarDAO dao=new CarDAO();
    }
}

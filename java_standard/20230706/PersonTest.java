package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        //한사람의 데이터를 저장할 변수를 선언
        PersonDTO p=new PersonDTO();
        p.name="홍길동";
        p.age=50;
        p.phone="010-0101-0101";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}

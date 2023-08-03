package fc.java.part4;
import fc.java.poly.*;
public class InterFaceTest {
    public static void main(String[] args) {
        //리모콘으로 Radio와 tv를 동작시켜보자.
        //다형성이 100%보장이 돤다.
        //부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬수가 있다.
        //RemoCon r=new RemoCon(); 객체생성 불가
        //부모의 역할을 할 수 있다.
        RemoCon remo=new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        //remo.internet();

        remo = new Tv();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        //remo.internet();
    }
}

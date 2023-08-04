package fc.java.poly;

public class ObjectTest {
    public static void main(String[] args) {
        //A객체를 upcasting으로 생성하세요.
        //A a = new A();
        //a.display();
        Object obj = new A();//upcasting
        ((A)obj).display();//Downcasting
    }
}

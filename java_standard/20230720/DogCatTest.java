package fc.java.part4;
import fc.java.model.*;
public class DogCatTest {
    //Dog객체를 생성하고 eat()동작을 구동해보자.
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();

        Cat c=new Cat();
        c.eat();
        c.night();
    }

}

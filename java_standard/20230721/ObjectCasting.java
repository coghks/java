package fc.java.part4;
import fc.java.model.*;
public class ObjectCasting {
    public static void main(String[] args) {
        //Animal--Dog,Cat
        Animal ani=new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

        Cat c=(Cat)ani; //다운 캐스팅
        c.night();

        ((Cat)ani).night();

    }
}

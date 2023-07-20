package fc.java.part4;
import fc.java.model.*;
public class OverrideTest {
    public static void main(String[] args) {
        //upcasting:Dog.java(X),Animal<>Dog.class(o)
        Animal ani=new Dog();
        ani.eat();//Animal---(동적 바인딩)-->Dog

        ani=new Cat();
        ani.eat();//동물처럼 먹다-->고양이처럼먹다
    }
}

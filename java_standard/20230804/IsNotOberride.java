package fc.java.part4;
import fc.java.poly.*;
public class IsNotOberride {
    public static void main(String[] args) {
        //재정의를 안했기 때문에  -> 부모가 명령을 내리면 (메세지를 보내면) 오동작을 한다.
        //[다형성을 보장하지 않음] ->그러면 다형성을 보장할려면?(재정의를 강제로 하도록 만들어 주면 된다.)
        Animal ani=new Dog();
        ani.eat();

        ani=new Cat();
        ani.eat();
    }
}

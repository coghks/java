package course.part1;

import model2.A;
import model2.B;
import model2.C;
import model2.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        // a,b,c 객체를 배열(object)에 저장하고 출력

        ObjectArray list = new ObjectArray();
        list.add(new A()); // upcasting Object element = new A();
        list.add(new B()); // upcasting Object element = new B();
        list.add(new C()); // upcasting Object element = new C();

        A a =(A)list.get(0); // A<=Object
        a.display();
        B b =(B)list.get(1); // B<=Object
        b.display();
        C c =(C)list.get(2); // C<=Object
        c.display();

        for(int i = 0; i<list.size(); i++){
            if(list.get(i) instanceof A){
                ((A)list.get(i)).display();
            }
            else if(list.get(i) instanceof B){
                ((B)list.get(i)).display();
            }
            else{
                ((C)list.get(i)).display();
            }
        }

    }
}

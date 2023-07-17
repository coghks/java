package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; //st1:object
        Student st2; //st2:object
        Student st3; //st3:object

        st1=new Student("홍길동","컴퓨터공학과",37,"bit@empas.com",2023110,"010-1231-1231");//st1:instance
        st2=new Student("김길동","컴퓨터공학과",37,"bit@empas.com",2023110,"010-1231-1231");//st2:instance
        st3=new Student("나길동","컴퓨터공학과",37,"bit@empas.com",2023110,"010-1231-1231");//st3:instance

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}

package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        //객체배열을 이용하여 4명의 학생 데이터를 저장하고 출력하세요.
        Student[] std=new Student[4];
        std[0]=new Student("홍길동","컴퓨터공학과",37,"bit@empas.com",2023110,"010-1231-1231");
        std[1]=new Student("나길동","전기",37,"bit@empas.com",2023110,"010-1231-1231");
        std[2]=new Student("김길동","건축",37,"bit@empas.com",2023110,"010-1231-1231");
        std[3]=new Student("이길동","통신",37,"bit@empas.com",2023110,"010-1231-1231");
        for(int i=0;i<std.length;i++){
            System.out.println(std[i].toString());
        }
        for(Student st:std){
            System.out.println(st.toString());
        }
    }
}

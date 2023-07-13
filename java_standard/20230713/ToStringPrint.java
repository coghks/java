package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        //생성자 메서드를 통해 personvo객체에 원하는 이름,나이, 전화번호를 저장하고 toString()메서드로 출력
        PersonVO vo=new PersonVO("홍길동",34,"010-0101-0101");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo.toString());
        System.out.println(vo);
    }
}

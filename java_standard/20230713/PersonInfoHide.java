package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        //한 사람의 회원 정보를 저장할 객체를 생성하세요
        PersonVO vo=new PersonVO();
        vo.setName("홍길동");
        vo.setAge(50);
        vo.setPhone("010-1234-1233");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());

    }
}

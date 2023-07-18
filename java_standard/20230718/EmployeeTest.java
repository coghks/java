package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        //일반사원 한명의 객체를 생성하고 데이터를 저장 후 출력을 하세요
        RempVO vo=new RempVO();
        //vo.name="홍길동";
        //vo.age=50;
        //vo.phone="010-0101-1919";
        //vo.empDate="2022-10-10";
        //vo.dept="홍보부";
        //vo.marriage=true;
        //출력
        //System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone+"\t"+vo.empDate+"\t"+vo.dept+"\t"+vo.marriage);
        System.out.println(vo.toString()) ;
    }
}

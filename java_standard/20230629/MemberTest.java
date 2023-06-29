public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "정채환";
        m.addr = "울산";
        m.age = 25;
        m.tel = "123456";
        m.weight = 30;
        m.email = "ch@naver.com";

        System.out.println(m.name+"\t"+m.addr+"\t"+m.age+"\t"+m.tel+"\t"+m.weight+"\t"+m.email);
        System.out.println("m = " + m);
    }
}

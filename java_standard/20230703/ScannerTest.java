import java.util.*;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num=scan.nextInt(); //블럭상태
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요:");
        float f=scan.nextFloat();
        System.out.println("f = " + f);

        scan.nextLine(); //버퍼비우기
        System.out.print("문자열를 입력하세요:");
        String str=scan.nextLine();
        System.out.println("str = " + str);
    }
}

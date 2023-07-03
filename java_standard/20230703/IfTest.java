import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {
        //윤년 판독기 (4의 배수이면서 100으로 나누어 떨어지지지 않는 년도 또는 400의 배수인 년도)
        Scanner scan = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year=scan.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)) {
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}

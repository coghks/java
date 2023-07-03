import java.util.Scanner;
public class IfbasicTest {
    public static void main(String[] args) {
        //x값이 0보다 큰경우에 양수입니다
        int x=10;
        if(x>0){
            System.out.println("양수입니다");
        }
        //정수 1개 입력받아 입력된 수가 7의 배수인지 출력
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num=scan.nextInt();
        if(num%7==0){
            System.out.println("num = "+num+"은 7의 배수입니다");
        }
        //나이를 입력받아 19세 이상이면 성인임을 출력
        System.out.print("나이를 입력: ");
        int age=scan.nextInt();
        if(age>=19){
            System.out.println("성인입니다");
        }
        System.out.println("종료");
    }
}

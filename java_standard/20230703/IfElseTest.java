import java.util.Scanner;
public class IfElseTest {
    public static void main(String[] args) {
        int x=10;
        if(x>=0){
            System.out.println("0 or 양수입니다.");
        }else{
            System.out.println("음수입니다.");
        }
        //정수 1개를 입력 받아 짝수인지 홀수 인지를 판단하는 프로그램을 만드시오.
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }

    }

}

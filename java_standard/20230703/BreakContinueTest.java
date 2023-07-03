public class BreakContinueTest {
    public static void main(String[] args) {
        //char[] c={shutdown} o만나면 중지
        char[] c={'s','h','u','t','d','o','w','n'};
        for(int i=0;i<c.length;i++){
            if(c[i]=='o'){
                break;
            }
            System.out.println(c[i]);
        }
        //1~10 3의 배수의 개수를 구하여 출력
        int num=0;
        for(int i=1;i<=10;i++){

            if(i%3==0){
                num++;
            }
        }
        System.out.println(num);
    }
}

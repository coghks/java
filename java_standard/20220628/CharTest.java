public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c);
        int a = 'A';
        System.out.println("a = " + a);
        int b = 'B'+1;
        System.out.println("b = " + (char)b); //형변환casting
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가';
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00';
        System.out.println("hanU = " + (char)hanU);
        char upper = 'A';
        char lower = (char)(upper+32);
        System.out.println("lower = " + lower);
        
        char lower1 = 'u';
        int upper1 = lower1-32;
        System.out.println("upper1 = " +(char)upper1);
        
        char i = '1';
        char j = '2';
        int sum = (i-48)+(j-48);
        System.out.println("sum = " + sum);


     }
}

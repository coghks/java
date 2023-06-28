public class VDATest {
    public static void main(String[] args) {
        int v;
        v = 10;
        System.out.println("v = " + v);
        
        int a = 10;
        int b = a;
        int c = b*10;
        System.out.println("c = " + c);
        
        int sum = 0;
        sum = sum+1;
        sum = sum+2;
        sum = sum+3;
        sum = sum+4;
        sum = sum+5;
        System.out.println("sum = " + sum);

        int x = 10;
        int y = 20;
        int z = x;
        x = y;
        System.out.println(x);
        y = z;
        System.out.println(y);

    }
}

public class MaxMinValue {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //작은수
        int min=(a<b)?a:b;
        System.out.println("min = " + min);
        
        //큰수
        int max=(a>b)?a:b;
        System.out.println("max = " + max);
    }
}

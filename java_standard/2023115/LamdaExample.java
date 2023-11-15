package course.part2;

import model2.MathOperation;

public class LamdaExample {
    public static void main(String[] args) {
        MathOperation add = (int x,int y) -> x+y;;
        MathOperation multi= (x,y) -> x*y;
        int result = add.operation(10,20);
        System.out.println("result = " + result);
        int mulresult = multi.operation(10,20);
        System.out.println("mulresult = " + mulresult);
    }
}

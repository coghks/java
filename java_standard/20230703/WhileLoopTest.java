public class WhileLoopTest {
    public static void main(String[] args) {
        //배열 원소 출력
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int i=0;
        while(i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
        System.out.println(i);
        i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);
    }
}

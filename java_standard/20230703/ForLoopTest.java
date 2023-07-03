public class ForLoopTest {
    public static void main(String[] args) {
        //for(int i=1;i<=10;i++){
            //System.out.println(i);

        for(char d='A';d<='Z';d++){
            System.out.println(d+":"+(int)d);
        }
        //int[] numbers=={1,2,3,4,5,6,7,8,9,10} 배열 원소를 향상된 for문으로 출력
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for(int i : numbers){
            System.out.println("i = " + i);
            
        }
        
    }
}


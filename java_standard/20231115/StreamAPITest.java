package course.part2;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        /*int even = 0;
        for(int num : numbers){
            if(num%2 == 0){
                even+=num;
            }
        }*/
        int somOfEvens = Arrays.stream(numbers)
                            .filter(n->n%2==0)
                            .sum();


        System.out.println("somOfEvens = " + somOfEvens); //6

        int[] evenNumbers =  Arrays.stream(numbers).filter(n->n%2==0).toArray();
        
        for(int even : evenNumbers){
            System.out.println("even = " + even);
        }
                
    }
}

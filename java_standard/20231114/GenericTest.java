package course.part2;

import model2.Book;
import model2.Movie;
import model2.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
        /*ObjectArr<String> array = new ObjectArr<>(5);
        array.set(0,"Hello");
        array.set(1,"World");
        array.set(2,"Java");
        array.set(3,"Generic");

        for(int i = 0; i<array.size(); i++ ){
            System.out.println(array.get(i));
        }*/
        ObjectArr<Movie> bList = new ObjectArr<>(5);
        bList.set(0, new Movie("괴물","봉준호","2006","한국"));
        bList.set(1, new Movie("기생충","봉준호","2019","한국"));
        bList.set(2, new Movie("완벽한 타인","이재규","2018","한국"));

        for(int i = 0; i<bList.size(); i++){
            System.out.println(bList.get(i));
        }



    }
}
//제네릭을 사용하게 되면 재사용성이 높아진다
//제네릭 타입을 선언할 때 어떤 데이터 타입이 들어올지 결정하지 않으므로, 다양한 데이터 타입에 대해 일반적으로 적용할 수 있는 메서드나 클래스를 작성할 수 있다.
package course.part2;

import model2.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>(); // Movie[]
        list.add(new Movie("완벽한 타인","이재규","2018","한국"));
        //list.add("hello"); // x
        list.add(new Movie("기생충","봉준호","2016","한국"));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}

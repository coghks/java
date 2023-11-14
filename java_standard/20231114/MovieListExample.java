package course.part2;

import model2.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("괴물","봉준호","2006","한국"));
        list.add(new Movie("기생충","봉준호","2019","한국"));
        list.add(new Movie("완벽한 타인","이재규","2018","한국"));

        for(Movie m : list){
            System.out.println(m);
        }

        String scarchTitle = "기생충";
        // 순차검색 > 이진검색(*)
        for(Movie m : list){
            if(m.getTitle().equals(scarchTitle)){
                System.out.println(m);
                break;
            }

        }
    }
}

package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        //영화 객체를 설계하고 데이터를 저장 한 후 출력하세요.
        MovieVO vo=new MovieVO("아바타",20221214,"제이크설리","액션",192.0f,12);
        System.out.println(vo.toString());

    }
}

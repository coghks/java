package gu_hyeon;

import java.util.Arrays;
import java.util.Scanner;

public class asdf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] a=sc.nextLine().split(" ");
        String[] b=new String[1];
        b[0]="a";
        System.out.println(a[0]);
        System.out.println(b[0]);
        if (a[0]!=b[0]) System.out.println(true);

    }
}
//자바는 기본형 배열과 참조형 배열의 차이가 있다. int char기본형 배열은 값 그 자체를 저장하지만 string과 같은 참조형 배열은 그 주소를 저장하기 때문에
//처음 코딩했던 방법에서 계속 오류가 났었다.

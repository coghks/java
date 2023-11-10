package model2;

import java.util.Arrays;

public class ObjectArray {
    private  final int DEFAULT_CAPACITY=5; // 수정 불가 > 상수
    private Object [] elements;
    private int size = 0;
    // 생성동작
    public ObjectArray(){

        this(5); // this(5): 생성자 안에서 다른생성자를 호출할때 사용
    }

    public ObjectArray(int capacity){
        elements= new Object[capacity]; // 원하는크기의 배열을 생성한다.
    }
    // 저장하는 동작
    public void add(Object element){
        if(size == elements.length){
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        // 크기 체크
        elements[size++] = element;
    }

    // 데이터 가져오는 동작
    public Object get(int index){
        // index체크
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException("index의 범위(0~9)가 초과됨"); //
        }

        return elements[index];
    }
    // 원소의 개수를 넘겨주는 동작
     public int size(){
        return size;
     }

     public void ensureCapacity(){
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapacity);
     }

}

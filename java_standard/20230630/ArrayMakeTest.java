public class ArrayMakeTest {
    public static void main(String[] args) {
        //정수 5개가 들어 갈 배열 생성
        int[] a = new int[5];
        for(int i=0; i<a.length; i++){
            a[i]=i;
            System.out.println(a[i]);
        }

    }
}

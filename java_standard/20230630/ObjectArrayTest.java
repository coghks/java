public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b=new Book[3]; //Book b;
        b[0]=new Book();      //b=new book();
        b[0].title="자바";
        b[0].author="저자";
        b[0].company="한빛";
        b[0].price=123;
        b[0].isbn="123123123";
        b[0].page=456;
        System.out.println(b[0].title+"\t"+b[0].page+'\t'+b[0].isbn+"\t"+b[0].price+"\t"+b[0].company+"\t"+b[0].author);

        b[1]=new Book();
        b[1].title="파이썬";
        b[1].author="저자";
        b[1].company="한빛";
        b[1].price=123;
        b[1].isbn="123123123";
        b[1].page=456;
        System.out.println(b[1].title+"\t"+b[1].page+'\t'+b[1].isbn+"\t"+b[1].price+"\t"+b[1].company+"\t"+b[1].author);

        b[2]=new Book();
        b[2].title="자바스크립트";
        b[2].author="저자";
        b[2].company="한빛";
        b[2].price=123;
        b[2].isbn="123123123";
        b[2].page=456;
        System.out.println(b[2].title+"\t"+b[2].page+'\t'+b[2].isbn+"\t"+b[2].price+"\t"+b[2].company+"\t"+b[2].author);
    }
}

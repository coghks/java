public class BookExam {
    public static void main(String[] args) {
        //객체 생성(인스턴스 생성)
        Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "패스트캠퍼스";
        b.author = "박매일";
        b.page = 300;
        b.isbn = "1199110";

        System.out.println(b.title+"\t"+b.page+'\t'+b.isbn+"\t"+b.price+"\t"+b.company+"\t"+b.author);

    }
}

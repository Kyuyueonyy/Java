package lecture.book;

public class Application {
    public static void main(String[] args) {

        Book myBook = new Book();

        myBook.title="해리포터와 마법사의 돌";
        myBook.author="조엔 K 롤링";
        myBook.pageCount=320;
        myBook.coverType="하드 커버";

        //제목을 해리포터와 혼혈왕자로
        Book myBook2 = new Book();
        myBook2.title="해리포터와 혼혈왕자";
        myBook2.author="조엔 K 롤링";
        myBook2.pageCount=320;
        myBook2.coverType="하드 커버";

        myBook.getTitle();
        myBook2.getTitle();

        System.out.println(myBook2.toString());

        // String author, String title, String coverType, int pageCount)
        Book myBook3 = new Book ("bear", "자바가 좋아요", 50, "하드타입");


    }
}

package lecture.book;

public class Book {
    //author, title, pageCount, coverType

    //클래스의 구성 요소 : 필드, 생성자, 메소드
    //필드 생성
    String author;
    String title;
    int pageCount;
    String coverType;

    //생성자
    //기본생성자 (매개변수가 없는 생성자)
    //-> 매개변수 있는 생성자가 하나라도 있으면 컴파일러가 자동으로 기본생성자를 만들어주지

    //클래스 이름과 똑같이!! 작성 , 반환타입 없음
    //생성자 메소드는 반드시 클래스 이름과 동일해야 한다 (대/소문자까지)
    //생성자 메소드는 반환형을 작성하지 않는다. (작성하게되면 일반 메소드로 인식함)
    //클래스를 만들고 아무것도 작성하지 않으면 jvm은 비어있는 생성자를 만들어줌

    /*public Book() {
        System.out.println("기본 생성자 호출👼");
    }*/

    public Book(String author, String title, int pageCount, String coverType) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.coverType = coverType;
    }

    public Book(String author) {
        this.author = author;
    }

    public Book() {

    }

    //메소드
    //alt + insert 로 getter 생성
    public String getTitle() {
        System.out.println(title + " 책의 작가는 " + author + " 입니다.");
        return title;

        }
    }

    //오버로딩
    //-> 같은 이름의 메소드나 생성자를 매개변수의 개수나 타입에 따라 여러개 선언하는 것

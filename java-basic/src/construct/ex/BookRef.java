package construct.ex;

public class BookRef {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    public BookRef(){
        this("", "", 0);
    }

    public BookRef(String title, String author){
        this(title, author, 0);
    }

    public BookRef(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}

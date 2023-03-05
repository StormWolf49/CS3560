public class Course {
    private Integer code;
    private Book book;

    public Course(Integer code) {
        this.code = code;
    }
    public Course(Integer code, Book book) {
        this.code = code;
        this.book = book;
    }
}

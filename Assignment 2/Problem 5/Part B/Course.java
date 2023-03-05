public class Course {
    private Integer code;
    private Book book;

    public Course(Integer c) {
        code = c;
    }
    public Course(Integer c, Book b) {
        code = c;
        book = b;
    }
}

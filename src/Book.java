public class Book {
    private String ID;
    private String Authors;
    private String title;
    private String Publisher;
    private int year;
    private int Num_copy;
    private String Lib_ID;
    private String categories_ID;

    public Book(String ID , String title , String Authors , String publisher , int year , int Num_copy , String categories_ID ,String lib_ID)
    {
        this.Authors = Authors;
        this.categories_ID = categories_ID;
        this.Lib_ID = lib_ID;
        this.Publisher = publisher;
        this.Num_copy = Num_copy;
        this.ID = ID;
        this.title = title;
        this.year =year;
    }


}

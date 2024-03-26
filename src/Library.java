public class Library {
    private String ID;
    private String Name;
    private String Address;
    private int Stablished_Year;
    private int Table_count;
    private Book[] books = new Book[100];
    private int book_count;
    private int[] num_of_book;

    public void setBook(int book_counter , Book book , int book_count){
        books[book_counter] = book;
        num_of_book[book_counter] = book_count;

    }

    public Library(String ID , String name , int stablished_Year , int table_count , String address ){
        this.Address = address;
        this.ID = ID;
        this.Name = name;
        this.Table_count = table_count;
        this.Stablished_Year = stablished_Year;
    }

    public String getID() {
        return ID;
    }














    @Override
    public String toString() {
        return "Library{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Stablished_Year=" + Stablished_Year +
                ", Table_count=" + Table_count +
                '}';
    }
}

public class Categories {
    private String ID;
    private String Name;
    public Categories(String ID , String Name){
       this.ID = ID;
       this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}

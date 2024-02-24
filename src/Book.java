public class Book {
    private int id;
    private static int idgen=1;
    private String name;
    private int price;
    public Book(){
        this.id=idgen++;
    }
    public Book(String name, int price){
        this();
        this.name=name;
        this.price=price;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}

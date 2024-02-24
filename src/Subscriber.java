import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer{
    private String name;
    public Subscriber(){
    }
    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void handleEvent(List<Book> books) {
        System.out.println("Hi " + name + "\nThere is some changes in our store");
        for (Book book: books){
            System.out.println(book.getId() + "."+book.getName()+" "+book.getPrice());
        }
        System.out.println('\n');
    }


}

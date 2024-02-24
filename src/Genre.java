import java.util.ArrayList;
import java.util.List;

public class Genre implements Observed{
    List<Observer> subscribers = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    public Genre(){
    }
    public void AddBooks(Book book){
        books.add(book);
        notifyObservers();
    }
    public void delBook(int id){
        for (Book book: books){
            if (book.getId()==id){
                books.remove(book);
                notifyObservers();
                break;
            }
        }
    }
    public void showBooks(){
        for (Book book: books){
            System.out.println(book.getId() + "."+book.getName()+" "+book.getPrice());
        }
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.books);
        }
    }
}

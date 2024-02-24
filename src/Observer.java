import java.util.ArrayList;
import java.util.List;

public interface Observer {
    public void handleEvent(List<Book> books);
}
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       Genre fantastic = new Genre();
       Genre scifi = new Genre();
       Observer subscriber = new Subscriber("Danial");
       Observer subscriber2 = new Subscriber("Ayan");
       scifi.addObserver(subscriber2);
       fantastic.addObserver(subscriber);
       Book book = new Book("Harry Potter",2000);
       Book book2 = new Book("Frankenstein",2400);
       fantastic.AddBooks(book);
       scifi.AddBooks(book2);
       while (true){
            System.out.println("1.Add Fantastic book\n2.Add Sci-fi book\n3.Delete book\n4Exit");
            int choice2 = sc.nextInt();
            if (choice2 == 1){
                System.out.println("Name of book:");
                String name = sc.next();
                System.out.println("Price:");
                int price = sc.nextInt();
                fantastic.AddBooks(new Book(name,price));
            }
            else if (choice2 == 2){
                System.out.println("Name of book:");
                String name = sc.next();
                System.out.println("Price:");
                int price = sc.nextInt();
                fantastic.AddBooks(new Book(name,price));
                }
            else if (choice2 == 3){
                System.out.println("From which genre you want to to delete book:\n1.Fantastic\n2.Sci-fi");
                int delGenre = sc.nextInt();
                if (delGenre == 1){
                    fantastic.showBooks();
                    System.out.println("Which book you want to delete(write id):");
                    int delBook = sc.nextInt();
                    fantastic.delBook(delBook);
                }
                else if (delGenre == 2){
                    scifi.showBooks();
                    System.out.println("Which book you want to delete(write id):");
                    int delBook = sc.nextInt();
                    scifi.delBook(delBook);
                }
            }
            else if (choice2 == 4){
                break;
            }
           }
       }
  }
import java.util.*;

class Book{
    int id;
    String title,author,publisher;
    double price;

    public Book(int id,String title,String author,String publisher,double price){
        this.id=id;
        this.title=title;
        this.publisher=publisher;
        this.author=author;
        this.price=price;
    }

    public void display(){
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Publisher: " + publisher + " | Price: Rs." + price);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Book> db =new ArrayList<>();

        db.add(new Book(101, "Java Basics", "Balagurusamy", "McGrawHill", 450.0));
        db.add(new Book(102, "Let Us C", "Yashavant Kanetkar", "BPB", 299.0));
        db.add(new Book(103, "Advanced Java", "Balagurusamy", "McGrawHill", 650.0));
        db.add(new Book(104, "Data Structures", "Lipschutz", "Schaum", 520.0));

    System.out.println("--Original Book DB----");
    for(Book b:db){
        b.display();
    }

    List<Book> sorted_db =new ArrayList<>(db);
    Collections.sort(sorted_db,new Comparator<Book>(){
        public int compare(Book b1,Book b2){
            return Double.compare(b1.price,b2.price);
        }

    });

    System.out.println("----Sorted DB----");
    for(Book b:sorted_db){
        b.display();
    }

    System.out.println("Enter Author Name:");
    String searchAuthor=sc.nextLine();

    System.out.println("Books written by: "+ searchAuthor+" :");
    for(Book b:db){
        if(b.author.equalsIgnoreCase(searchAuthor)){
            b.display();
        }
    }

    System.out.println("Enter price threshold");
    double targetPrice=sc.nextDouble();

    for(Book b:db){
        if(b.price>targetPrice){
            b.display();
        }
    }

    }

}

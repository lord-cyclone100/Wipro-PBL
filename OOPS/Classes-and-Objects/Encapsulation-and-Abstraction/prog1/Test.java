class Author{
  private String name;
  private String email;
  private char gender;

  public Author(String name, String email, char gender){
    this.name = name;
    this.email = email;
    this.gender = gender;
  }
  public void getAuthorDetails(){
    System.out.println("Name : "+name+"\n"+"Email : "+email+"\n"+"Gender : "+gender);
  }
}

class Book{
  private String name;
  private Author author;
  private double price;
  private int qtyInStock;
  
  public Book(String name, double price, int qtyInStock, String authorName, String email, char gender){
    this.name = name;
    this.price = price;
    this.qtyInStock = qtyInStock;
    this.author = new Author(authorName, email, gender);
  }

  public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public int getQtyInStock(){
        return qtyInStock;
    }



    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String authorName, String email, char gender){
        this.author = new Author(authorName, email, gender);
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }


    public void getBookDetails(){
        System.out.println( "Book: " + name +"\nPrice: Rs " + price +"\nQuantity: " + qtyInStock +"\nAuthor Details: ");
        author.getAuthorDetails();
    }
}

public class Test {
  public static void main(String[] args) {
    Book book = new Book("Feluda's Adventures", 299.50,150,"Satyajit Ray", "ray@example.com", 'M');

    book.getBookDetails();
  }
  
}

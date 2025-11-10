public class Book {
    private String title; 
    private double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    public String getTitle(){
        return this.title;
    }
    public String getBookInfo(){
        return this.title +" "+this.price;
    }
    
    public static void main(String[] args){
        Book book1 = new Book( "Intro To Git",499.99);
        Book book2 = new Book("Gautam is Selling",2.99);
        System.out.println("Book 1 Title: " + book1.getTitle());
        System.out.println("Book 1 Info: " + book1.getBookInfo());
        System.out.println("Book 2 Title: " + book2.getTitle());
        System.out.println("Book 2 Info: " + book2.getBookInfo());
    }
    
    
}

 
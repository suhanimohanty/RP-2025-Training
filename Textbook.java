public class Textbook extends Book {
    private int edition;

    // Constructor
    public Textbook(String title, double price, int edition) {
        super(title, price);
        this.edition = edition;
    } 
    // Getter method for edition
    public int getEdition() {
        return this.edition;
    }

    // Test the Textbook class
    public static void main(String[] args) {
        Textbook bio2015 = new Textbook("Biology", 49.75, 2);
        Textbook bio2019 = new Textbook("Biology", 39.75, 3);
        System.out.println("Textbook 1 Edition: " + bio2015.getEdition());
        System.out.println("Textbook 1 Title: " + bio2015.getTitle());
        System.out.println("Textbook 1 Price: " + bio2015.getPrice());
        System.out.println("Textbook 2 Edition: " + bio2019.getEdition());
        System.out.println("Textbook 2 Title: " + bio2019.getTitle());
        System.out.println("Textbook 2 Price: " + bio2019.getPrice());
        
    }
}
    
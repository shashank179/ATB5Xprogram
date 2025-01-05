package JavaTraining;

public class Exercise {
    
    String title;
    String author;
    static int total = 0;
    
    public Exercise(String title, String author){
        this.title = title;
        this.author = author;
        total++;
    }
    
    public void display(){
        System.out.println("Book title is " + title);
        System.out.println("Book author is "+ author);
    }
    
    public static void totalbooks(){
        System.out.println("Total Number of books is "+ total);
    }
    
public static void main(String[] args){
    Exercise book = new Exercise("Wall of Fame", "Sudakar");
    Exercise book1 = new Exercise("Wall of phame", "Dheeraj");
    
    book.display();
    book1.display();
    
    Exercise.totalbooks();
}

}
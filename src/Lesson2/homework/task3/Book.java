package Lesson2.homework.task3;


public class Book extends Papyrus {
    private String tittle;

    public Book() {

    }


    public Book(int pages, String tittle) {
        super(pages);
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                '}';
    }
}

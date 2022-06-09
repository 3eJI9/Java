package Lesson2.homework.task3;



public class Comics extends Book {
    private String universe;

    public Comics() {
    }


    public Comics(int pages, String tittle, String universe) {
        super(pages, tittle);
        this.universe = universe;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "universe='" + universe + '\'' +
                '}';
    }
}

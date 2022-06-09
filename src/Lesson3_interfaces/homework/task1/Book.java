package Lesson3_interfaces.homework.task1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book implements Printable {
    private String tittle;
    private int pageCount;
    private int price;

    @Override
    public void print() {
        System.out.println("info" + this.getClass().getSimpleName() + " " + this.toString());
    }
}

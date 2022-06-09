package Lesson3_interfaces.homework.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Magazine implements Printable {
    private String tittle;
    private Genre genre;

    @Override
    public void print() {
        System.out.println("info about" + this.getClass().getName() + " " + this.toString());
    }
}

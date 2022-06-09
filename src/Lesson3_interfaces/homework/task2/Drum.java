package Lesson3_interfaces.homework.task2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Drum implements Instrument {
    private int size;

    @Override
    public String play() {
        return "Instruments" + " " + this.getClass().getSimpleName() + " " + this.toString();

    }
}

package Lesson3_interfaces.homework.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Trumpet implements Instrument {
    public double diametr;

    @Override
    public String play() {
        return "Instruments" + " " + this.getClass().getSimpleName() + " " + this.toString();

    }
}

package Lesson3_interfaces.homework.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Piano implements Instrument {
    private int keys;

    @Override
    public String play() {
        return "Instruments" + " " + this.getClass().getSimpleName() + " " + this.toString();    }
}

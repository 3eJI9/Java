package Lesson3_interfaces.homework.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Trumpet(14.4));
        instruments.add(new Guitar(7));
        instruments.add(new Drum(777));
        instruments.add(new Piano(54));
        for (Instrument instrument : instruments) {
            System.out.println(instrument.play());

        }


    }
}

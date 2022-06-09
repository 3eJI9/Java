package Lesson3_interfaces.homework.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("KE", 400, 500));
        printables.add(new Magazine("Midl", Genre.ENTERTAINMENT));
        for (Printable printable : printables) {
            printable.print();

        }
    }
}


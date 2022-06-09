package Lesson2.homework.task2;

public class Main {
    public static void main(String[] args) {
        WorkStation workStation = new WorkStation("i7", "Apple", 16, true, new Dockstation("ASUS", 4));

        System.out.println(workStation);
    }
}

package Lesson2.homework.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("CSS", 73277));
        skills.add(new Skill("JS", 7327));
        skills.add(new Skill("SQL", 733177));
        skills.add(new Skill("HTML", 124));
        Car car = new Car("A6", 2005, 1331);
        User user = new User(1,
                "MAs",
                "JuLa",
                "dsd@bad.com",
                43,
                Gender.MALE,
                skills,
                car);

    }
}

package Lesson2.homework.task4;

import java.util.ArrayList;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills = new ArrayList<>();
    private Car car;

    public void addSkill(Skill skill) {
        this.skills.add(skill);

    }
}

package Lesson2.demo2_enums;

public class Main {
    public static void main(String[] args) {

        Role[] values = Role.values();
        for (Role value : values) {
            System.out.println(value + " " + value.ordinal());

        }

//    User user = new User(21, "jdjjsdj", Role.ADMIN);
//
//    Extractor extractor =new Extractor();
//    extractor.extractToken(user);// Manager

    }
}

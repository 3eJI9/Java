package Lesson2.demo4_final;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        User user = new SuperUser();
        ArrayList<User> users = new ArrayList<>();

        users.add(new User());
        users.add(new SuperUser(1, "Dana", "jdjjdd", "kkkw12"));


        SuperUser user = (SuperUser) users.get(1);
        user.getLogin();

//        SuperUser superUser = new SuperUser(1, "Hellen", "Mal", "jfjjf");
//
//        System.out.println(superUser);
//        superUser.greeting();
    }
}

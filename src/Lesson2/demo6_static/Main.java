package Lesson2.demo6_static;

public class Main {
    public static void main(String[] args) {
//        System.out.println(User.counter);
//        User user1 = new User();
//        user1.counter = 100;
//        System.out.println(user1.counter);
//        User user2 = new User();
//        System.out.println(user1.counter);

        System.out.println(User.counter);
        User user0 = new User("Lala");
        System.out.println(User.counter);
        User user1 = new User("Li");
        System.out.println(User.counter);
        User user2 = new User("Iba");
        System.out.println(User.counter);
        User user3 = new User("Hij");

    }
}

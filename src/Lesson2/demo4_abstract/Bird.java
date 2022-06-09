package Lesson2.demo4_abstract;

public class Bird extends Animal {
    @Override
    public void Signalize() {
        System.out.println("Kria-kria");
    }

    private int eyes;
    private boolean wings;
}

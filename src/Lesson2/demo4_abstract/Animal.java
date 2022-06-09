package Lesson2.demo4_abstract;

public abstract class Animal {
    private Boolean isBrain;
    private Boolean tail;

    public Animal() {

    }

    public Boolean getTail() {
        return tail;
    }

    public void setTail(Boolean tail) {
        this.tail = tail;
    }

    public Boolean getBrain() {
        return isBrain;
    }

    public void setBrain(Boolean brain) {
        isBrain = brain;
    }

    public Animal(Boolean isBrain, Boolean tail) {
        this.isBrain = isBrain;
        this.tail = tail;
    }

    public abstract void Signalize();
}


package Lesson2.homework.task2;

public class LapTop extends PC {
    private Boolean touchPad;

    public LapTop() {
    }

    public LapTop(String cpu, String monitor, int ram, Boolean touchPad) {
        super(cpu, monitor, ram);
        this.touchPad = touchPad;
    }

    public Boolean getTouchPad() {
        return touchPad;
    }

    public void setTouchPad(Boolean touchPad) {
        this.touchPad = touchPad;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "touchPad=" + touchPad +
                '}';
    }
}

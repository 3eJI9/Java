package Lesson2.homework.task2;

public class UltraBook extends LapTop {
    private Boolean touchscreen;

    public UltraBook(Boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public UltraBook(String cpu, String monitor, int ram, Boolean touchPad, Boolean touchscreen) {
        super(cpu, monitor, ram, touchPad);
        this.touchscreen = touchscreen;
    }

    public Boolean getTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(Boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    @Override
    public String toString() {
        return "UltraBook{" +
                "touchscreen=" + touchscreen +
                '}';
    }
}

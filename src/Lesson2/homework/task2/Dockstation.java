package Lesson2.homework.task2;

public class Dockstation {
    private String tittle;
    private int ports;

    public Dockstation() {
    }

    public Dockstation(String tittle, int ports) {
        this.tittle = tittle;
        this.ports = ports;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "Dockstation{" +
                "tittle='" + tittle + '\'' +
                ", ports=" + ports +
                '}';
    }
    public void start() {
        System.out.println("Olololo");
    }

}
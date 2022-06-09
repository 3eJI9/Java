package Lesson2.homework.task2;

public class PC {
    private String cpu;
    private String monitor;
    private int ram;

    public PC() {
    }

    public PC(String cpu, String monitor, int ram) {
        this.cpu = cpu;
        this.monitor = monitor;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", monitor='" + monitor + '\'' +
                ", ram=" + ram +
                '}';
    }
}

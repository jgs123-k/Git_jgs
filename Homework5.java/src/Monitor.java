public class Monitor {
    private String size;
    private String color;
    private String power;

    public Monitor(String size, String color, String power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}
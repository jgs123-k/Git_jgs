public class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }


    public static void main(String[] args){
        Computer comp = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        Monitor mon = new Monitor("24 inch", "Black", "45W");

        PersonalComputer pc = new PersonalComputer(comp, mon);
        pc.turnOn();
        pc.printInfo();
    }

}


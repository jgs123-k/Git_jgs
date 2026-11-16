import java.util.PrimitiveIterator;

public abstract class Printer {
    public String model;
    public int printedCount;
    public int availableCount;

    Printer(String m, int count){
        this.model = m;
        this.availableCount = count;
    }

    abstract boolean print();
}

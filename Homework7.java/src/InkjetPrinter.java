public class InkjetPrinter extends Printer {

    InkjetPrinter(String model, int availableCount){
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (availableCount == 0) {
            System.out.printf(model + ":" + (printedCount + 1) + "매째 인쇄 실패-잉크부족\n");
            return false;
        } else if (availableCount >= 1){
            this.availableCount = availableCount - 1;
            this.printedCount = printedCount + 1;
            return true;
        }
        return false;
    }
}

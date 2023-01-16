public class Printer {
    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume) {
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public boolean ableToPrint(int pageCount, int copies) {
        return this.sheetsLeft >= (pageCount * copies);
    }
    public String print(int pageCount, int copies) {
        String message1 = "Document printed";
        String message2 = "Cannot print";
        if (ableToPrint(pageCount, copies)) {
            this.sheetsLeft -= pageCount * copies;
            this.tonerVolume -= pageCount * copies;
            return message1;
        } else {
            return message2;
        }
    }






}

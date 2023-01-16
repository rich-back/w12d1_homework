import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(1000, 100000);
    }

    @Test
    public void isAbleToPrint() {
        assertTrue(printer.ableToPrint(100, 5));
    }

    @Test
    public void isNotAbleToPrint() {
        assertFalse(printer.ableToPrint(100, 12));
    }

    @Test
    public void canPrint() {
        printer.print(100, 5);
        assertEquals(500, printer.getSheetsLeft());
        assertEquals(99500, printer.getTonerVolume());
    }

    @Test
    public void cannotPrint() {
        printer.print(100, 12);
        assertEquals(1000, printer.getSheetsLeft());
        assertEquals(100000, printer.getTonerVolume());
    }



}

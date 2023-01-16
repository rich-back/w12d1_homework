import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasInitialVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink() {
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(70, waterbottle.getVolume());
    }

    @Test
    public void canEmpty() {
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFill() {
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }




}

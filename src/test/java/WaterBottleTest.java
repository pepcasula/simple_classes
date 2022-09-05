import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void Before (){
        waterbottle = new WaterBottle();
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterbottle.empty());

    }

    @Test
    public void canFill(){
        waterbottle.empty();
        assertEquals(100, waterbottle.fill());
    }

}

package work.src.test.java.ua.lviv.iot;

import model.Good;
import model.HockeyPuck;
import model.Purpose;
import org.junit.Test;

import static org.junit.Assert.*;

public class HockeyPuckTest {

    @Test
    public void testToString() {
        HockeyPuck hockeyPuck = new HockeyPuck("HockeyPuck", 100, "Gan", "Ukraine",
                "Leather", Purpose.GOALKEEPER, 4.1, 2.2);
        String expected = "Name=HockeyPuck PriceInUAH=100.0 Producer=Gan ProducingCountry=Ukraine Material=Leather Purpose=GOALKEEPER Thickness=4.1 Radius=2.2";
        String actual = hockeyPuck.toString();
        assertEquals(expected, actual);

    }
}
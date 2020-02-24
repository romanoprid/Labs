package work.src.test.java.ua.lviv.iot;
import static org.junit.Assert.*;
import model.*;
import org.junit.Test;

public class GoodTest {


    @Test
    public void testToString() {
        Good good = new Good("HockeyPuck",100,"Gan","Ukraine",
                "Leather", Purpose.GOALKEEPER);
        String expected = "Name=HockeyPuck PriceInUAH=100.0 Producer=Gan ProducingCountry=Ukraine Material=Leather Purpose=GOALKEEPER" ;
        String actual = good.toString();
        assertEquals(expected,actual);
    }
}
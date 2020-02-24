package work.src.test.java.ua.lviv.iot;

import model.*;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class ProtectiveClothesTest {

    @Test
    public void testToString() {
            ProtectiveClothes protectiveClothes = new ProtectiveClothes("Helmet",100,"Gan",
                    "Ukraine",
                    "Leather", Purpose.GOALKEEPER, Level.MEDIUM);
            String expected = "Name=Helmet PriceInUAH=100.0 Producer=Gan ProducingCountry=Ukraine Material=Leather Purpose=GOALKEEPER ProtectionLevel=MEDIUM";
            String actual = protectiveClothes.toString();
            assertEquals(expected,actual);
    }
}
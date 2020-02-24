package work.src.test.java.ua.lviv.iot;

import model.IceSkates;
import model.Purpose;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceSkatesTest {

    @Test
    public void testToString() {
        IceSkates iceSkates = new IceSkates("IceSkates",100,"Gan","Ukraine",
                "Leather", Purpose.GOALKEEPER,2,41.5);
        String expected = "Name=IceSkates PriceInUAH=100.0 Producer=Gan ProducingCountry=Ukraine Material=Leather Purpose=GOALKEEPER BladeAmount=2 FootSize=41.5" ;
        String actual = iceSkates.toString();
        assertEquals(expected,actual);
    }
}
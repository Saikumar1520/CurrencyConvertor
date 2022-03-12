import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyConvertorTest {
    public static CurrencyConvertor CurrencyConvertor;
    @BeforeClass
    public static void setup(){
        CurrencyConvertor = new CurrencyConvertor();
    }
    @Test
    public void testdollar(){
        assertEquals(2, CurrencyConvertor.dollar(156));
    }

    @Test
    public void testeuro(){
        assertEquals(2, CurrencyConvertor.euro(172));
    }

    @Test
    public void testpound(){
        assertEquals(2, CurrencyConvertor.pound(204));
    }


}

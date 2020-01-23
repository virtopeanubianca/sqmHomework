import model.WasherFunctions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WasherTest {

    Washer testWasher;

    @Before
    public void setUp() throws Exception {
        testWasher = new Washer();
    }

    @Test
    public void testWasherCreation(){
        Assert.assertNotNull(testWasher);
    }

    @Test
    public void testWasherDefaultPriceIsSet(){
        Assert.assertEquals(Washer.price, 10000.99, 0.001 );
    }

    @Test
    public void testWashNotStarted(){
       Assert.assertFalse(testWasher.wash());
    }

    @Test
    public void testWashStarted(){
        testWasher.setWasherFunctions(WasherFunctions.ADD_WASHES);
        Assert.assertTrue(testWasher.wash());
    }

    @Test
    public void testCalculateTime(){
        testWasher.calculateTime(WasherFunctions.ADD_WASHES);
        Assert.assertEquals(testWasher.getTimer(), 70, 0.001);
    }
}

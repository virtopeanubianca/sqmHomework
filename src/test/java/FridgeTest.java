import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FridgeTest {

    Fridge testFridge;
    @Before
    public void setUp() throws Exception {
       testFridge = new Fridge();
    }

    @Test
    public void testGetPrice(){
        Assert.assertEquals(5000,testFridge.getPrice(),0.001);
    }

    @Test
    public void testGetDefaultDegrees(){
        Assert.assertEquals(2, testFridge.getDegrees(), 0.001);
    }

    @Test
    public void testGetPriceForSmartFridgeWithNoWaterIceFilter(){
        testFridge.setSmart(true);
        Assert.assertEquals(7000.66, testFridge.getPrice(), 0.001);
    }

    @Test(timeout = 1)
    public void testGetPricePerformance(){
        testFridge.getPrice();
    }
}

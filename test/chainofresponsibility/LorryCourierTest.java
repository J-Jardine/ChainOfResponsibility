package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Lorry courier handler
 *
 * @author t7077222
 */
public class LorryCourierTest {
    
    public LorryCourierTest() {
    }
    
    /**
     * Test of null vehicleChain method, of class LorryCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        LorryCourier lorry = new LorryCourier();
        boolean expectedResult = false;
        boolean actualResult = lorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class LorryCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextSubVehicle() {
        System.out.println("----------Testing Set Next Sub Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 800, " TS1 3BX", 5, 1900, 0);
        LorryCourier lorry = new LorryCourier();
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        lorry.setNextSubVehicle(smallLorry);      
        boolean expectedResult = true;
        boolean actualResult = lorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
}

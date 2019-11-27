package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Large lorry courier test class
 *
 * @author t7077222
 */
public class LargeLorryCourierTest {
    
    public LargeLorryCourierTest() {
    }
    
    /**
     * Test of increment method, of class LargeLorryCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        LargeLorryCourier largeLorry = new LargeLorryCourier();
        largeLorry.increment();
        int expectedResult = 2;
        int actualResult = largeLorry.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class LargeLorryCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        LargeLorryCourier largeLorry = new LargeLorryCourier();
        boolean expectedResult = false;
        boolean actualResult = largeLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of vehicleChain method, of class LargeLorryCourier.
     * Expected outcome is for a large car to be handled by the large car handler.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 2050, " TS1 3BX", 4, 1900, 0);
        LargeLorryCourier largeLorry = new LargeLorryCourier();
        boolean expectedResult = true;
        boolean actualResult = largeLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     *  Test of testIsFull method, of class LargeLorryCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        LargeLorryCourier largeLorry = new LargeLorryCourier();
        LargeLorryCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = largeLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

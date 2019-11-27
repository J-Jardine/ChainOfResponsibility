package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Large van courier test class
 *
 * @author t7077222
 */
public class LargeVanCourierTest {
    
    public LargeVanCourierTest() {
    }
    
    /**
     * Test of increment method, of class LargeVanCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        LargeVanCourier largeVan = new LargeVanCourier();
        largeVan.increment();
        int expectedResult = 2;
        int actualResult = LargeVanCourier.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

     /**
     * Test of null vehicleChain method, of class LargeVanCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        LargeVanCourier largeVan = new LargeVanCourier();
        boolean expectedResult = false;
        boolean actualResult = largeVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

     /**
     * Test of vehicleChain method, of class LargeVanCourier.
     * Expected outcome is for a large car to be handled by the large car handler.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 450, " TS1 3BX", 4, 1900, 0);
        LargeVanCourier largeVan = new LargeVanCourier();
        boolean expectedResult = true;
        boolean actualResult = largeVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class LargeVanCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextVehicle() {
        System.out.println("----------Testing Set Next Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 550, " TS1 3BX", 5, 1900, 0);
        LargeVanCourier largeVan = new LargeVanCourier();
        LorryCourier lorry = new LorryCourier();
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        largeVan.setNextVehicle(lorry);   
        lorry.setNextSubVehicle(smallLorry);
        boolean expectedResult = true;
        boolean actualResult = largeVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
     /**
     *  Test of testIsFull method, of class LargeVanCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
     @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        LargeLorryCourier largeVan = new LargeLorryCourier();
        LargeLorryCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = largeVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    
}

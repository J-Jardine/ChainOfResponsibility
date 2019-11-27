package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Medium Van courier test class
 *
 * @author t7077222
 */
public class MediumVanCourierTest {
    
    public MediumVanCourierTest() {
    }
    
    /**
     * Test of increment method, of class MediumVanCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        MediumVanCourier mediumVan = new MediumVanCourier();
        mediumVan.increment();
        int expectedResult = 2;
        int actualResult = mediumVan.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class MediumVanCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        MediumVanCourier mediumVan = new MediumVanCourier();
        boolean expectedResult = false;
        boolean actualResult = mediumVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of vehicleChain method, of class MediumVanCourier.
     * Expected outcome is for a large car to be handled by the large car handler.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 350, " TS1 3BX", 4, 1900, 0);
        MediumVanCourier mediumVan = new MediumVanCourier();
        boolean expectedResult = true;
        boolean actualResult = mediumVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class MediumVanCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextSubVehicle() {
        System.out.println("----------Testing Set Next Sub Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 450, " TS1 3BX", 5, 1900, 0);
        MediumVanCourier mediumVan = new MediumVanCourier();
        LargeVanCourier largeVan = new LargeVanCourier();     
        mediumVan.setNextSubVehicle(largeVan);      
        boolean expectedResult = true;
        boolean actualResult = mediumVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
     /**
     *  Test of testIsFull method, of class MediumVanCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        MediumVanCourier mediumVan = new MediumVanCourier();
        MediumVanCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = mediumVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
        
    /**
     * Test of setNextSubVehicle method, of class MediumVanCourier.
     * Expected outcome is false as there is no next vehicle from medium van.
     */
    @Test
    public void testSetNextVehicle()
    {
        System.out.println("----------Testing Set Next Vehicle----------");
        MediumVanCourier mediumVan = new MediumVanCourier();
        LorryCourier lorry = new LorryCourier();
        mediumVan.setNextVehicle(lorry); 
        boolean expectedResult = false;
        boolean actualResult = mediumVan.setNextVehicle(lorry);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

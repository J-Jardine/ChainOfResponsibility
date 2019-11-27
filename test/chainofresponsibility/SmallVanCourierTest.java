package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Small van courier handler
 *
 * @author t7077222
 */
public class SmallVanCourierTest {
    
    public SmallVanCourierTest() {
    }
 
    /**
     * Test of increment method, of class SmallVanCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        SmallVanCourier smallVan = new SmallVanCourier();
        smallVan.increment();
        int expectedResult = 2;
        int actualResult = SmallVanCourier.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class SmallVanCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        SmallVanCourier smallVan = new SmallVanCourier();
        boolean expectedResult = false;
        boolean actualResult = smallVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextVehicle method, of class SmallVanCourier.
     * Expected outcome is for the next vehicle to be set.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        SmallVanCourier smallVan = new SmallVanCourier();
        boolean expectedResult = true;
        boolean actualResult = smallVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class SmallVanCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextSubVehicle() {
        System.out.println("----------Testing Set Next Sub Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 350, " TS1 3BX", 5, 1900, 0);
        SmallVanCourier smallVan = new SmallVanCourier();
        MediumVanCourier mediumVan = new MediumVanCourier();     
        smallVan.setNextSubVehicle(mediumVan);      
        boolean expectedResult = true;
        boolean actualResult = smallVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     *  Test of testIsFull method, of class SmallVanCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        SmallVanCourier smallVan = new SmallVanCourier();
        SmallVanCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = smallVan.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test of setNextSubVehicle method, of class SmallVanCourier.
     * Expected outcome is false as there is no next vehicle from medium van.
     */
    @Test
    public void testSetNextVehicle()
    {
        System.out.println("----------Testing Set Next Vehicle----------");
        SmallVanCourier smallVan = new SmallVanCourier();
        LorryCourier lorry = new LorryCourier();
        smallVan.setNextVehicle(lorry); 
        boolean expectedResult = false;
        boolean actualResult = smallVan.setNextVehicle(lorry);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Small lorry courier handler
 *
 * @author t7077222
 */
public class SmallLorryCourierTest {
    
    public SmallLorryCourierTest() {
    }

   /**
     * Test of increment method, of class SmallLorryCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        smallLorry.increment();
        int expectedResult = 2;
        int actualResult = SmallLorryCourier.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class SmallLorryCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        boolean expectedResult = false;
        boolean actualResult = smallLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextVehicle method, of class SmallLorryCourier.
     * Expected outcome is for the next vehicle to be set.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 800, " TS1 3BX", 4, 1900, 0);
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        boolean expectedResult = true;
        boolean actualResult = smallLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class SmallLorryCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextSubVehicle() {
        System.out.println("----------Testing Set Next Sub Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 1050, " TS1 3BX", 5, 1900, 0);
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        MediumLorryCourier mediumLorry = new MediumLorryCourier();     
        smallLorry.setNextSubVehicle(mediumLorry);      
        boolean expectedResult = true;
        boolean actualResult = smallLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     *  Test of testIsFull method, of class SmallLorryCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        SmallLorryCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = smallLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test of setNextSubVehicle method, of class SmallLorryCourier.
     * Expected outcome is false as there is no next vehicle from medium van.
     */
    @Test
    public void testSetNextVehicle()
    {
        System.out.println("----------Testing Set Next Vehicle----------");
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        LorryCourier lorry = new LorryCourier();
        smallLorry.setNextVehicle(lorry); 
        boolean expectedResult = false;
        boolean actualResult = smallLorry.setNextVehicle(lorry);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    
    
}

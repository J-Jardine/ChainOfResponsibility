package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Medium Lorry courier test class
 *
 * @author t7077222
 */
public class MediumLorryCourierTest {
    
    public MediumLorryCourierTest() {
    }
    
    /**
     * Test of increment method, of class MediumLorryCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        MediumLorryCourier mediumLorry = new MediumLorryCourier();
        mediumLorry.increment();
        int expectedResult = 2;
        int actualResult = mediumLorry.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class MediumLorryCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        MediumLorryCourier mediumLorry = new MediumLorryCourier();
        boolean expectedResult = false;
        boolean actualResult = mediumLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of vehicleChain method, of class MediumLorryCourier.
     * Expected outcome is for a large car to be handled by the large car handler.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 1050, " TS1 3BX", 4, 1900, 0);
        MediumLorryCourier mediumLorry = new MediumLorryCourier();
        boolean expectedResult = true;
        boolean actualResult = mediumLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class MediumLorryCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextSubVehicle() {
        System.out.println("----------Testing Set Next Sub Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 2050, " TS1 3BX", 5, 1900, 0);
        MediumLorryCourier mediumLorry = new MediumLorryCourier();
        LargeLorryCourier largeLorry = new LargeLorryCourier();     
        mediumLorry.setNextSubVehicle(largeLorry);      
        boolean expectedResult = true;
        boolean actualResult = mediumLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     *  Test of testIsFull method, of class MediumLorryCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        MediumLorryCourier mediumLorry = new MediumLorryCourier();
        MediumLorryCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = mediumLorry.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test of setNextSubVehicle method, of class MediumLorryCourier.
     * Expected outcome is false as there is no next vehicle from medium van.
     */
    @Test
    public void testSetNextVehicle()
    {
        System.out.println("----------Testing Set Next Vehicle----------");
        MediumLorryCourier mediumLorry = new MediumLorryCourier();
        LorryCourier lorry = new LorryCourier();
        mediumLorry.setNextVehicle(lorry); 
        boolean expectedResult = false;
        boolean actualResult = mediumLorry.setNextVehicle(lorry);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

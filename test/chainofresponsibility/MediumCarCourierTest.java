package chainofresponsibility;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Medium Car courier test class
 *
 * @author t7077222
 */
public class MediumCarCourierTest {
    
    public MediumCarCourierTest() {
    }

     /**
     * Test of increment method, of class MediumCarCourier.
     * Expected outcome is for the incrementation to work and be set to 3.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        MediumCarCourier mediumCar = new MediumCarCourier();
        mediumCar.increment();
        int expectedResult = 3;
        int actualResult = MediumCarCourier.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class MediumCarCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        MediumCarCourier mediumCar = new MediumCarCourier();
        boolean expectedResult = false;
        boolean actualResult = mediumCar.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of vehicleChain method, of class MediumCarCourier.
     * Expected outcome is for a large car to be handled by the large car handler.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 70, " TS1 3BX", 4, 1900, 0);
        MediumCarCourier mediumCar = new MediumCarCourier();
        boolean expectedResult = true;
        boolean actualResult = mediumCar.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class MediumCarCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextSubVehicle() {
        System.out.println("----------Testing Set Next Sub Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 70, " TS1 3BX", 5, 1900, 0);
        MediumCarCourier mediumCar = new MediumCarCourier();
        LargeCarCourier largeCar = new LargeCarCourier();
        mediumCar.setNextSubVehicle(largeCar);      
        boolean expectedResult = true;
        boolean actualResult = mediumCar.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     *  Test of testIsFull method, of class MediumCarCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        MediumCarCourier mediumCarCourier = new MediumCarCourier();
        MediumCarCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = mediumCarCourier.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test of setNextSubVehicle method, of class MediumCarCourier.
     * Expected outcome is false as there is no next vehicle from medium van.
     */
    @Test
    public void testSetNextVehicle()
    {
        System.out.println("----------Testing Set Next Vehicle----------");
        MediumCarCourier mediumCar = new MediumCarCourier();
        VanCourier van = new VanCourier();
        mediumCar.setNextVehicle(van); 
        boolean expectedResult = false;
        boolean actualResult = mediumCar.setNextVehicle(van);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

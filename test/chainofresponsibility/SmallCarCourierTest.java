package chainofresponsibility;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 * Small car courier handler
 *
 * @author t7077222
 */
public class SmallCarCourierTest {
    
    public SmallCarCourierTest() {
    }

    /**
     * Test of increment method, of class SmallCarCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        SmallCarCourier smallCar = new SmallCarCourier();
        smallCar.increment();
        int expectedResult = 2;
        int actualResult = SmallCarCourier.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class SmallCarCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        SmallCarCourier smallCar = new SmallCarCourier();
        boolean expectedResult = false;
        boolean actualResult = smallCar.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextVehicle method, of class SmallCarCourier.
     * Expected outcome is for the next vehicle to be set.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        SmallCarCourier smallCar = new SmallCarCourier();
        boolean expectedResult = true;
        boolean actualResult = smallCar.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class SmallCarCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextSubVehicle() {
        System.out.println("----------Testing Set Next Sub Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 70, " TS1 3BX", 5, 1900, 0);
        SmallCarCourier smallCar = new SmallCarCourier();
        MediumCarCourier mediumCar = new MediumCarCourier();     
        smallCar.setNextSubVehicle(mediumCar);      
        boolean expectedResult = true;
        boolean actualResult = smallCar.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     *  Test of testIsFull method, of class SmallCarCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 4, 1900, 0);
        SmallCarCourier smallCar = new SmallCarCourier();
        SmallCarCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = smallCar.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test of setNextSubVehicle method, of class SmallCarCourier.
     * Expected outcome is false as there is no next vehicle from medium van.
     */
    @Test
    public void testSetNextVehicle()
    {
        System.out.println("----------Testing Set Next Vehicle----------");
        SmallCarCourier smallCar = new SmallCarCourier();
        VanCourier van = new VanCourier();
        smallCar.setNextVehicle(van); 
        boolean expectedResult = false;
        boolean actualResult = smallCar.setNextVehicle(van);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
}

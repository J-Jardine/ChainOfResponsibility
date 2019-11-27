package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Motorbike courier handler
 *
 * @author t7077222
 */
public class MotorbikeCourierTest {
    
    /**
     * Test of increment method, of class MotorbikeCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        MotorbikeCourier motorbike = new MotorbikeCourier();
        motorbike.increment();
        int expectedResult = 2;
        int actualResult = motorbike.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class MotorbikeCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        MotorbikeCourier motorbike = new MotorbikeCourier();
        boolean expectedResult = false;
        boolean actualResult = motorbike.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextVehicle method, of class MotorbikeCourier.
     * Expected outcome is for the next vehicle to be set.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 25, " TS1 3BX", 4, 1900, 0);
        MotorbikeCourier motorbike = new MotorbikeCourier();
        boolean expectedResult = true;
        boolean actualResult = motorbike.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class MotorbikeCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextVehicle() {
        System.out.println("----------Testing Set Next Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 45, " TS1 3BX", 5, 1900, 0);
        MotorbikeCourier motorbike = new MotorbikeCourier();
        CarCourier car = new CarCourier();
        SmallCarCourier smallCar = new SmallCarCourier();
        motorbike.setNextVehicle(car);
        car.setNextSubVehicle(smallCar);
        boolean expectedResult = true;
        boolean actualResult = motorbike.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     *  Test of testIsFull method, of class MotorbikeCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 25, " TS1 3BX", 4, 1900, 0);
        MotorbikeCourier motorbike = new MotorbikeCourier();
        MotorbikeCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = motorbike.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

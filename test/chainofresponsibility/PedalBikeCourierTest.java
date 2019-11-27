package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pedal bike courier handler
 *
 * @author t7077222
 */
public class PedalBikeCourierTest {
    
    public PedalBikeCourierTest() {
    }
    
    /**
     * Test of increment method, of class PedalBikeCourier.
     * Expected outcome is for the incrementation to work and be set to 2.
     */
    @Test
    public void testIncrement() {
        System.out.println("----------Testing Vehicle Incrementing Method----------");
        PedalBikeCourier pedalBike = new PedalBikeCourier();
        pedalBike.increment();
        int expectedResult = 2;
        int actualResult = pedalBike.vehicleCount;
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of null vehicleChain method, of class PedalBikeCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        PedalBikeCourier pedalBike = new PedalBikeCourier();
        boolean expectedResult = false;
        boolean actualResult = pedalBike.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextVehicle method, of class PedalBikeCourier.
     * Expected outcome is for the next vehicle to be set.
     */
    @Test
    public void testVehicleChain() {
        System.out.println("----------Testing Instance Of Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 5, " TS1 3BX", 4, 1900, 0);
        PedalBikeCourier pedalBike = new PedalBikeCourier();
        boolean expectedResult = true;
        boolean actualResult = pedalBike.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextSubVehicle method, of class PedalBikeCourier.
     * Expected outcome is for the next sub vehicle to be set.
     */
    @Test
    public void testSetNextVehicle() {
        System.out.println("----------Testing Set Next Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 25, " TS1 3BX", 5, 1900, 0);
        PedalBikeCourier pedalBike = new PedalBikeCourier();
        MotorbikeCourier motorbike = new MotorbikeCourier();
        pedalBike.setNextVehicle(motorbike);   
        boolean expectedResult = true;
        boolean actualResult = pedalBike.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     *  Test of testIsFull method, of class PedalBikeCourier.
     *  Expected outcome is for the class to be full so no more vehicles
     *  can be added to is and return true;
     */
    @Test
    public void testIsFull()
    {
        System.out.println("----------Testing Is Full----------");
        Vehicle vehicle = new Vehicle(1, 5, " TS1 3BX", 4, 1900, 0);
        PedalBikeCourier pedalBike = new PedalBikeCourier();
        PedalBikeCourier.vehicleCount = 3;
        boolean expectedResult = true;
        boolean actualResult = pedalBike.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Van courier test class
 *
 * @author t7077222
 */
public class VanCourierTest {

    public VanCourierTest() {
    }
    
    /**
     * Test of null vehicleChain method, of class CarCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        VanCourier van = new VanCourier();
        boolean expectedResult = false;
        boolean actualResult = van.vehicleChain(vehicle);
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
        Vehicle vehicle = new Vehicle(1, 250, " TS1 3BX", 5, 1900, 0);
        VanCourier van = new VanCourier();
        SmallVanCourier smallVan = new SmallVanCourier();
        van.setNextSubVehicle(smallVan);
        boolean expectedResult = true;
        boolean actualResult = van.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

}

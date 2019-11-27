package chainofresponsibility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Car courier test class
 *
 * @author t7077222
 */
public class CarCourierTest {
    
    public CarCourierTest() {
    }
    
    /**
     * Test of null vehicleChain method, of class CarCourier.
     * Expected outcome is null.
     */
    @Test
    public void testNullVehicleChain() {
        System.out.println("----------Testing Null Instance Of Vehicle----------");
        Vehicle vehicle = null;
        CarCourier car = new CarCourier();
        boolean expectedResult = false;
        boolean actualResult = car.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of setNextVehicle method, of class CarCourier.
     * Expected outcome is for the next vehicle to be set.
     */
    @Test
    public void testSetNextVehicle() {
        System.out.println("----------Testing Set Next Vehicle----------");
        Vehicle vehicle = new Vehicle(1, 200, " TS1 3BX", 5, 1900, 0);
        CarCourier car = new CarCourier();
        VanCourier van = new VanCourier();
        SmallVanCourier smallVan = new SmallVanCourier();
        car.setNextVehicle(van);   
        van.setNextSubVehicle(smallVan);
        boolean expectedResult = true;
        boolean actualResult = car.vehicleChain(vehicle);
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
        Vehicle vehicle = new Vehicle(1, 40, " TS1 3BX", 5, 1900, 0);
        CarCourier car = new CarCourier();
        SmallCarCourier smallCar = new SmallCarCourier();
        car.setNextSubVehicle(smallCar);      
        boolean expectedResult = true;
        boolean actualResult = car.vehicleChain(vehicle);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result  : " + actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
}

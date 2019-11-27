package chainofresponsibility;

/**
 * Small van vehicle handler
 *
 * @author t7077222
 */
public class SmallVanCourier implements VehicleChain {

    private VehicleChain next;
    private VehicleChain nextSub;
    private boolean isFull = false;
    
    public static int maxVehicle = 3;
    public static int vehicleCount = 0;
    

    /**
     * Increments the vehicle count
     *
     * @param vehicleCount
     */
    public void increment() {
        vehicleCount++;
    }

    /**
     * Gets the current vehicle in the chain and checks to see if it can handle
     * the request
     *
     * @param vehicle
     * @return
     */
    @Override
    public boolean vehicleChain(Vehicle vehicle) {
        if (vehicle == null) {
            return false;
        } else {
            if (vehicle.getOrderWeight() < 300) {
                if (isFull == false) {
                    if (vehicleCount < maxVehicle) {
                        increment();
                        System.out.println("A Small Van With: " + vehicle.toString()
                                + " ,Capacity [" + vehicleCount
                                + "/" + maxVehicle + "]");
                    } else {
                        isFull = true;
                        System.out.println("All Of The Small Vans Are In Use Passing The Request To The Next Available Vehicle!");
                    }
                }
            } else {
                nextSub.vehicleChain(vehicle);
            }
        }
        return true;
    }

    /**
     * Sets the next vehicle in the chain
     *
     * @param next
     * @return
     */
    @Override
    public boolean setNextVehicle(VehicleChain next) {
        this.next = next;
        return false;
    }

    /**
     * Sets the next sub vehicle in the chain
     *
     * @param next
     * @return
     */
    @Override
    public boolean setNextSubVehicle(VehicleChain next) {
        this.nextSub = next;
        return true;
    }

}

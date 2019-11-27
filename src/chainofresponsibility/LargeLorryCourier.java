package chainofresponsibility;

/**
 * Small lorry vehicle handler
 *
 * @author t7077222
 */
public class LargeLorryCourier implements VehicleChain {

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
        }
        if (vehicle.getOrderWeight() < 3000) {
            if (isFull == false) {
                if (vehicleCount < maxVehicle) {
                    increment();
                    System.out.println("A Large Lorry With: " + vehicle.toString()
                            + " ,Capacity [" + vehicleCount
                            + "/" + maxVehicle + "]");
                } else {
                    isFull = true;
                    System.out.println("All Of The Large Lorrys Are In Use Passing The Request To The Next Available Vehicle!");
                }
            }
        } else {
            System.out.println("No Vehicle Can Handle That Weight, Please Make Sure Weight Is Correct!");
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

package chainofresponsibility;

/**
 * Lorry courier handler
 *
 * @author t7077222
 */
public class LorryCourier implements VehicleChain {

    private VehicleChain next;
    private VehicleChain nextSub;

    /**
     * Gets the current vehicle in the chain and checks to see if its sub chain
     * can handle it, if not set the next vehicle that can handle the request
     *
     * @param vehicle
     * @return
     */
    @Override
    public boolean vehicleChain(Vehicle vehicle) {
        if (vehicle == null) {
            return false;
        }
        if (vehicle.getOrderWeight() > 3000) {
            System.exit(0);
        } else {
            nextSub.vehicleChain(vehicle);
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
        return true;
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

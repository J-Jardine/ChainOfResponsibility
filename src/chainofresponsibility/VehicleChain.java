package chainofresponsibility;
/**
 *
 * @author t7077222
 */
public interface VehicleChain
{
    /**
     * The handler receives the request and this is what will process it 
     * in the concrete handler classes.
     * @param vehicle
     * @return 
     */
    
    public boolean vehicleChain(Vehicle vehicle);
   
    /**
     * Sending the request to the next available handler in the chain.
     * @param next
     * @return 
     */
    public boolean setNextVehicle(VehicleChain next);
    
    /**
     * Sending the request to the next sub vehicle handler in the chain.
     * @param next
     * @return 
     */
    public boolean setNextSubVehicle(VehicleChain next);
}

package chainofresponsibility;
/**
 *
 * @author t7077222
 */
public class Vehicle
{

    /**
     * @return the orderID
     */
    public int getOrderID()
    {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }

    /**
     * @return the itemQTY
     */
    public double getItemQTY()
    {
        return itemQTY;
    }

    /**
     * @param itemQTY the itemQTY to set
     */
    public void setItemQTY(double itemQTY)
    {
        this.itemQTY = itemQTY;
    }

    /**
     * @return the orderWeight
     */
    public double getOrderWeight()
    {
        orderWeight = itemQTY * 1;
        return orderWeight;
    }

    /**
     * @param orderWeight the orderWeight to set
     */
    public void setOrderWeight(double orderWeight)
    {
        this.orderWeight = orderWeight;
    }

    /**
     * @return the deliveryAddress
     */
    public String getDeliveryAddress()
    {
        return deliveryAddress;
    }

    /**
     * @param deliveryAddress the deliveryAddress to set
     */
    public void setDeliveryAddress(String deliveryAddress)
    {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * @return the deliveryBay
     */
    public int getDeliveryBay()
    {
        return deliveryBay;
    }

    /**
     * @param deliveryBay the deliveryBay to set
     */
    public void setDeliveryBay(int deliveryBay)
    {
        this.deliveryBay = deliveryBay;
    }

    /**
     * @return the leadTime
     */
    public int getLeadTime()
    {
        return leadTime;
    }

    /**
     * @param leadTime the leadTime to set
     */
    public void setLeadTime(int leadTime)
    {
        this.leadTime = leadTime;
    }

    /**
     * @return the orderDelay
     */
    public int getOrderDelay()
    {
        return orderDelay;
    }

    /**
     * @param orderDelay the orderDelay to set
     */
    public void setOrderDelay(int orderDelay)
    {
        this.orderDelay = orderDelay;
    }
    
    public String toString()
    {
        return("OrderID: " + orderID + " ,itemQTY: " + itemQTY + " ,orderWeight: " + orderWeight +
                " ,deliveryAddress: " + deliveryAddress + " ,deliveryBay: " + deliveryBay +
                " , leadTime: " + leadTime + " orderDelay: " + orderDelay);
    }
    private int orderID;
    private double itemQTY;
    private double orderWeight;
    
    private String deliveryAddress;
    private int deliveryBay;
    
    private int leadTime;
    private int orderDelay;
    
    public Vehicle(int orderID, double itemQTY, String deliveryAddress, 
            int deliveryBay, int leadTime, int orderDelay)
    {
        this.orderID = orderID;
        this.itemQTY = itemQTY;
        this.deliveryAddress = deliveryAddress;
        this.deliveryBay = deliveryBay;
        this.leadTime = leadTime;
        this.orderDelay = orderDelay;
    }
}

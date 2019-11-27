package chainofresponsibility;

/**
 *
 * @author t7077222
 */
public class Main
{

    public static void main(String[] args)
    {
        PedalBikeCourier pedalBike = new PedalBikeCourier();
        
        MotorbikeCourier motorbike = new MotorbikeCourier();
            
        CarCourier car = new CarCourier();
        SmallCarCourier smallCar = new SmallCarCourier();
        MediumCarCourier mediumCar = new MediumCarCourier();
        LargeCarCourier largeCar = new LargeCarCourier();
        
        VanCourier van = new VanCourier();
        SmallVanCourier smallVan = new SmallVanCourier();
        MediumVanCourier mediumVan = new MediumVanCourier();
        LargeVanCourier largeVan = new LargeVanCourier();
        
        LorryCourier lorry = new LorryCourier();
        SmallLorryCourier smallLorry = new SmallLorryCourier();
        MediumLorryCourier mediumLorry = new MediumLorryCourier();
        LargeLorryCourier largeLorry = new LargeLorryCourier();
        
        pedalBike.setNextVehicle(motorbike);
        
        motorbike.setNextVehicle(car);
        
        car.setNextVehicle(van);
        car.setNextSubVehicle(smallCar);
        smallCar.setNextSubVehicle(mediumCar);
        mediumCar.setNextSubVehicle(largeCar);
        largeCar.setNextVehicle(van);
        
        van.setNextVehicle(lorry);
        van.setNextSubVehicle(smallVan);
        smallVan.setNextSubVehicle(mediumVan);
        mediumVan.setNextSubVehicle(largeVan);
        largeVan.setNextVehicle(lorry);
        
        lorry.setNextSubVehicle(smallLorry);
        smallLorry.setNextSubVehicle(mediumLorry);
        mediumLorry.setNextSubVehicle(largeLorry);
        largeLorry.setNextVehicle(pedalBike);

        Vehicle first;
        Vehicle second;

//        for (int i = 1; i < 3000; i++)
//        {
//            first = new Vehicle(1, i, " TS1 3BX", 4, 1900, 0);
//            pedalBike.vehicleChain(first);
//        }
        

//
//        SmallCarCourier.vehicleCount = 3;
//        MediumCarCourier.vehicleCount = 3;
//        LargeCarCourier.vehicleCount = 3;
//        
//        for (int i = 1; i < 3000; i++)
//        {
//            first = new Vehicle(1, i, " TS1 3BX", 4, 1900, 0);
//            pedalBike.vehicleChain(first);
//        }
    }
}

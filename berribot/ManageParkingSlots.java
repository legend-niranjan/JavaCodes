package berribot;

import java.util.ArrayList;
import java.util.List;

public class ManageParkingSlots {
    public static void main(String[] args) {
        Parkinglot lot = new Parkinglot(2);
        lot.parkVehicle(new Bike("MH10 AE 6643"));
        lot.parkVehicle(new Bike("NIKI1912"));
        lot.parkVehicle(new Car("MH10KN8668"));
    }
}

abstract class Vehicle{
    String number;
    Vehicle(String number){
        this. number=number;
    }
}

class Car extends Vehicle{
    Car(String numebr){
        super(numebr);
    }
}

class Bike extends Vehicle{
    Bike(String number){
        super(number);
    }
}

class ParkingSlot{
    int slotId;
    boolean isOccupied=false;
    Vehicle vehicle;

    ParkingSlot(int slotId){
        this.slotId=slotId;
    }

    void park(Vehicle vehicle){
        this.vehicle=vehicle;
        isOccupied=true;
    }
    void remove(){
        this.vehicle=null;
        this.isOccupied=false;
    }
}

class Parkinglot{
    int lotSize;
    List<ParkingSlot> slots = new ArrayList<>();
    Parkinglot(int lotSize){
        this.lotSize=lotSize;
        for (int i = 1; i <= lotSize; i++) {
            slots.add(new ParkingSlot(i));
        }
    }
    void parkVehicle(Vehicle vehicle){
        for (ParkingSlot slot : slots){
           if (!slot.isOccupied){
               slot.park(vehicle);
               System.out.println("Vehicle "+slot.vehicle.number+" is parked at slot "+ slot.slotId);
               return;
           }
        }
        System.out.println("Parking full...");
    }
    void removeVehicle(int id){
        ParkingSlot slot=slots.get(id-1);
        slot.remove();
        System.out.println(slot.slotId+" Removed successfully");
    }

}

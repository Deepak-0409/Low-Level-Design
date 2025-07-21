package com.practice.java.lld.parking_lot;

import com.practice.java.lld.parking_lot.floor.Floor;
import com.practice.java.lld.parking_lot.gates.EntryGate;
import com.practice.java.lld.parking_lot.gates.ExitGate;
import com.practice.java.lld.parking_lot.parking_spot.ParkingSpot;
import com.practice.java.lld.parking_lot.parking_strategy.NaturalOrderParkingStrategy;
import com.practice.java.lld.parking_lot.parking_strategy.ParkingStrategy;
import com.practice.java.lld.parking_lot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {
    private final List<Floor> floorList;
    private final List<ExitGate> exits;
    private final List<EntryGate> entries;
    private String id;

    private ParkingStrategy parkingStrategy;

    public static final ParkingLot INSTANCE = new ParkingLot();

    private ParkingLot() {
        id = UUID.randomUUID().toString();
        floorList = new ArrayList<>();
        exits = new ArrayList<>();
        entries = new ArrayList<>();
        parkingStrategy = new NaturalOrderParkingStrategy();
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public void addFloor(Floor floor) {
        this.floorList.add(floor);
    }

    public void addEntry(EntryGate entry) {
        this.entries.add(entry);
    }

    public void addExit(ExitGate exit) {
        this.exits.add(exit);
    }

    //remove - floor, exit, entry

    public Boolean isParkingAvailable(Vehicle vehicle) {
        for(Floor flr: floorList) {
            if(flr.isParkingAvailable(vehicle))
                return true;
        }
        return false;
    }

    public ParkingSpot getParkingSpot(Vehicle vehicle) {
        Floor availableFloor=null;

        for(Floor flr: floorList) {
            if(flr.isParkingAvailable(vehicle)) {
                availableFloor=flr;
                break;
            }
        }

        if(availableFloor!=null) {
            return this.parkingStrategy.park(availableFloor.getSpace(vehicle));
        }

        return null;
    }
}

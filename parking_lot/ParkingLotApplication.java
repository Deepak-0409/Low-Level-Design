package com.practice.java.lld.parking_lot;

import com.practice.java.lld.parking_lot.floor.Floor;
import com.practice.java.lld.parking_lot.gates.EntryGate;
import com.practice.java.lld.parking_lot.gates.ExitGate;
import com.practice.java.lld.parking_lot.parking_spot.BikeParkingSpot;
import com.practice.java.lld.parking_lot.parking_spot.CarParkingSpot;
import com.practice.java.lld.parking_lot.parking_spot.ParkingSpot;
import com.practice.java.lld.parking_lot.payment.CashPaymentStrategy;
import com.practice.java.lld.parking_lot.payment.PaymentStrategy;
import com.practice.java.lld.parking_lot.payment.UpiPaymentStrategy;
import com.practice.java.lld.parking_lot.pricing_strategy.HourlyPricingStrategy;
import com.practice.java.lld.parking_lot.pricing_strategy.MinutePricingStrategy;
import com.practice.java.lld.parking_lot.pricing_strategy.PricingStrategy;
import com.practice.java.lld.parking_lot.ticket.Ticket;
import com.practice.java.lld.parking_lot.vehicle.Bike;
import com.practice.java.lld.parking_lot.vehicle.Car;
import com.practice.java.lld.parking_lot.vehicle.Vehicle;

public class ParkingLotApplication {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.INSTANCE;
        PaymentStrategy upi = UpiPaymentStrategy.INSTANCE;
        PaymentStrategy cash = CashPaymentStrategy.INSTANCE;
        PricingStrategy minutePricing = new MinutePricingStrategy();
        PricingStrategy hourPricing = new HourlyPricingStrategy();

        Vehicle bike1 = new Bike("bike1");
        Vehicle car1 = new Car("car1");

        Vehicle bike2 = new Bike("bike2");
        Vehicle car2 = new Car("car2");

        Vehicle bike3 = new Bike("bike3");
        Vehicle car3 = new Car("car3");

        Floor f1 = new Floor("1");
        Floor f2 = new Floor("2");

        ParkingSpot bikeParkingSpot1 = new BikeParkingSpot("b-p1",minutePricing);
        ParkingSpot bikeParkingSpot2 = new BikeParkingSpot("b-p2",hourPricing);

        ParkingSpot carParkingSpot1 = new CarParkingSpot("c-p1",minutePricing);
        ParkingSpot carParkingSpot2 = new CarParkingSpot("c-p2",hourPricing);

        ExitGate exit = new ExitGate("exit-1");
        EntryGate entry = new EntryGate("entry-1");

        f1.addParkingSpot(bikeParkingSpot1);
        f1.addParkingSpot(carParkingSpot1);
        f2.addParkingSpot(bikeParkingSpot2);
        f2.addParkingSpot(carParkingSpot2);

        parkingLot.addEntry(entry);
        parkingLot.addExit(exit);
        parkingLot.addFloor(f1);
        parkingLot.addFloor(f2);


        Ticket t1 = entry.generateTicket(bike1);
        Ticket t2 = entry.generateTicket(bike2);
        Ticket t3 = entry.generateTicket(bike3);

        Ticket t4 = entry.generateTicket(car1);
        Ticket t5 = entry.generateTicket(car2);
        Ticket t6 = entry.generateTicket(car3);

        exit.makePayment(cash,t1);
        Ticket t7 = entry.generateTicket(bike3);
        exit.makePayment(upi,t2);
        exit.makePayment(cash,t3);
        exit.makePayment(cash,t4);
        Ticket t8 = entry.generateTicket(car3);
        exit.makePayment(upi,t5);
        exit.makePayment(upi,t6);
        exit.makePayment(upi,t7);
        exit.makePayment(upi,t8);

    }
}

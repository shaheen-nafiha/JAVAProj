package BusReserve;

import java.util.*;

public class BusDemo {

    public static void main(String[] args) {
        ArrayList<Bus> buses=new ArrayList<Bus>();


        ArrayList<Booking > bookings=new ArrayList<Booking>();

        buses.add(new Bus(1,true,2 ));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,76));



        Scanner sc=new Scanner(System.in);


        for(Bus b:buses){
            b.displayBusInfo();
        }


         int userOption=1;

        while (userOption==1){
            System.out.println("Enter 1 to book and 2 to exit");
            userOption=sc.nextInt();

            if(userOption==1){
                //System.out.println("Booking...");

                Booking booking=new Booking();

                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Booking is confirmed");
                }
                else{
                    System.out.println("bus is full");
                }
            }

        }


    }
}

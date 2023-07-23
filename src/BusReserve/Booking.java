package BusReserve;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking()  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        passengerName=sc.next();

        System.out.println("Enter the busNo");
        busNo=sc.nextInt();

        System.out.println("Enter date ");
        String dateinput=sc.next();

        SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
 try{
     date=df.parse(dateinput);
 }
 catch(ParseException e){
     e.printStackTrace();

        }



    }

    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusno()==busNo){
                capacity=bus.getCapacity();
            }
        }


        int booked=0;
        for(Booking b:bookings){
            if((b.busNo==busNo)&&(b.date.equals(date)))
            {
                booked++;
            }
        }

        return booked<capacity?true:false;
    }
}

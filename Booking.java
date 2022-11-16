package BusResv;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    String passName;
    int busNo;
    Date date;

    Booking(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of the passenger: ");
        passName = scan.next();
        System.out.println("Enter Bus Number: ");
        busNo = scan.nextInt();
        System.out.println("Enter date dd-MM-yy");
        String dateInput = scan.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses){
        int capacity = 0;
        for(Bus bus:buses){
            if(bus.getBusNo() == busNo)
                capacity = bus.getCapacity();     
        }
        int count = 0;
        for(Booking b:bookings){
           if(b.busNo == busNo && b.date.equals(date))
              count++;
        }
        return count<capacity ? true:false;
    }



}


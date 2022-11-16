package BusResv;

import java.util.Scanner;
import java.util.ArrayList;
public class Busdemo{
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1, 2, false));
        buses.add(new Bus(2, 30, true));
        buses.add(new Bus(3, 45, false));
        buses.add(new Bus(4, 50, true));

        for(Bus b:buses){
            b.displayBusInfo();
            System.out.println();
        }
        
         
        int userOpt =1;
        Scanner scan = new Scanner(System.in);
        while(userOpt==1){
            System.out.println("Enter 1 for Booking and 2 for Exit");
            userOpt = scan.nextInt();
            if(userOpt==1){
                Booking booking =  new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Ticket is Booked");
                }
                else
                 System.out.println("Sorry, Ticket is Full, Try Another Date or Bus ");

            }
        }
        
    }
}
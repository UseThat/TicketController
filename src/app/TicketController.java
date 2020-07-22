package app;

import data.Passenger;
import data.Ticket;
import data.TicketMachine;

import java.util.ArrayList;

public class TicketController {
    public static void main(String[] args) {

        ArrayList<Passenger> passengerArrayList = new ArrayList<>();
        for(int i = 0; i<10;i++){
            passengerArrayList.add(new Passenger("Mateusz"+i,"Testowy"+i));
            TicketMachine.buyTicket(passengerArrayList.get(i),i);
            if(i%2==0){
                passengerArrayList.get(i).getTicket().changeValidityTime();
            }
        }


        System.out.println(passengerArrayList.toString());


    }


}

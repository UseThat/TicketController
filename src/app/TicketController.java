package app;

import data.Passenger;
import data.Ticket;
import data.TicketMachine;

public class TicketController {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(40);
        Passenger passenger = new Passenger("Mateusz","WYgoda");
        System.out.println(passenger);
        TicketMachine.buyTicket(passenger,5);
        System.out.println(passenger);
        System.out.println(ticket);
    }
}

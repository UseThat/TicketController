package data;

public class TicketMachine {
    public static void buyTicket(Passenger passenger, int validityTime){
        passenger.setTicket(new Ticket(validityTime));
    }
}

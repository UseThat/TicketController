public class TicketController {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(40);
        Passenger passenger = new Passenger("Mateusz","WYgoda");
        System.out.println(passenger);
        System.out.println(ticket);
    }
}

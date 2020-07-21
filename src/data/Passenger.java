package data;

public class Passenger {
    private String firstName;
    private String lastName;
    private Ticket ticket;

    public Passenger(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Passenger(String firstName, String lastName, int ticketTime){
        this.firstName = firstName;
        this.lastName = lastName;
        ticket = new Ticket(ticketTime);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        if(ticket == null) {
            return firstName + " " + lastName;
        }else return firstName + " " + lastName + " "+ticket.getTicketValidityTime();
    }
}

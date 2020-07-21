import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime ticketBuyTime;
    private int validityTime;
    private LocalDateTime ticketValidityTime;

    //Constructor

    public Ticket(int validityTime){
        this.validityTime = validityTime;
        ticketBuyTime = LocalDateTime.now();
        setTicketTime(ticketBuyTime,this.validityTime);
    }

    //Set time for ticket

    private void setTicketTime(LocalDateTime ticketBuyTime, int validityTime){
        ticketValidityTime = ticketBuyTime.plusMinutes(validityTime);
    }

    //Getter and setter

    public LocalDateTime getTicketValidityTime() {
        return ticketValidityTime;
    }

    public void setTicketValidityTime(LocalDateTime ticketValidityTime) {
        this.ticketValidityTime = ticketValidityTime;
    }

    public LocalDateTime getTicketBuyTime() {
        return ticketBuyTime;
    }

    public void setTicketBuyTime(LocalDateTime ticketBuyTime) {
        this.ticketBuyTime = ticketBuyTime;
    }

    public int getValidityTime() {
        return validityTime;
    }

    public void setValidityTime(int validityTime) {
        this.validityTime = validityTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketBuyTime=" + ticketBuyTime +
                ", validityTime=" + validityTime +
                ", ticketValidityTime=" + ticketValidityTime +
                '}';
    }
}

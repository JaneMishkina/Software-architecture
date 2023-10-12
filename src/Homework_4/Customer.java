package Homework_4;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Customer {
    public int id;
    public CashProvider cash;
    public List<Ticket> tickets;

    public Customer(int id, CashProvider cash, List<Ticket> tickets) {
        this.id = id;
        this.cash = cash;
        this.tickets = tickets;
    }

    public boolean buyTicket (Ticket ticket) {

        return false;
    }

    public List<Ticket> searchTicket (DateTimeFormatter date, int number) {

        return null;
    }
}

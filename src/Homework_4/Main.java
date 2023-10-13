package Homework_4;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter data10 = DateTimeFormatter.ofPattern("2023-10-10");
        List<Ticket> tickets = new ArrayList<>();
        Ticket ticket1 = new Ticket(1, 5, 100, data10, true);
        Ticket ticket2 = new Ticket(2, 10, 100000, data10, true);

        Customer customer1 = new Customer(123, new CashProvider(123456, true, 123, 1000), tickets);
        customer1.buyTicket(ticket1);
//        customer1.buyTicket(ticket2);
//        customer1.buyTicket(ticket1);

        customer1.searchTicket(data10);

    }

}
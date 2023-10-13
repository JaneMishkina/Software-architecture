package Homework_4;
import java.util.Scanner;

public class CashProvider {
    private long numberCard;
    private boolean isAutorization;
    private int password;
    private int accountSum;

    public CashProvider(long numberCard, boolean isAutorization, int password, int accountSum) {
        this.numberCard = numberCard;
        this.isAutorization = isAutorization;
        this.password = password;
        this.accountSum = accountSum;
    }

    public boolean autorization(Customer customer) {
        System.out.println("Введите пароль от карты: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == customer.cash.password) {
            System.out.println("Пароль верный");
            return true;
        }
        System.out.println("Пароль не верный");
        return false;
    }

    public boolean buy (Ticket ticket) {
        if (ticket.price <= this.accountSum) {
            this.accountSum -= ticket.price;
            System.out.println("Куплен билет номер " + ticket.rootNumber);
            System.out.println("У вас осталось " + this.accountSum + "руб. на карте");
            return true;
        }
        System.out.println("Недостаточно средств на карте");

        return false;
    }
}
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers={new EmailLogger(),new FileLogger()};
        CustomerManager customerManager=new CustomerManager(loggers);
        Customer sezer=new Customer(1,"Sezer","bozbıyık");
        customerManager.add(sezer);
    }
}
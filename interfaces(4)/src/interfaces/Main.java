package interfaces;

public class Main {

    public static void main(String[] args) {

        Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger(),new DataBaseLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);

        Customer gokhan = new Customer (1,"Gokhan","Asilturk");
        customerManager.add(gokhan);
    }
}

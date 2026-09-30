public class AbstractionDemo {
    interface Payment {
        void pay(double amount);
    }

    static class CardPayment implements Payment {
        public void pay(double amount){
            System.out.println("Paid " + amount + " via CARD");
        }
    }

    static class UpiPayment implements Payment {
        public void pay(double amount){
            System.out.println("Paid " + amount + " via UPI");
        }
    }

    abstract static class Vehicle {
        abstract void start();
        void stop(){ System.out.println("Vehicle stopped"); }
    }

    static class Car extends Vehicle {
        void start(){ System.out.println("Car started with key"); }
    }

    public static void main(String[] args){
        Payment[] payments = { new CardPayment(), new UpiPayment() };
        for(Payment p : payments) p.pay(499);

        Vehicle v = new Car();
        v.start();
        v.stop();

        System.out.println("Abstraction hides implementation, exposes only behaviour");
    }
}

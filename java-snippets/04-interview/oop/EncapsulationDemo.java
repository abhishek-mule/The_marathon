public class EncapsulationDemo {
    static class Account {
        private String owner;
        private double balance;

        public Account(String owner, double balance){
            this.owner = owner;
            this.balance = balance;
        }

        public String getOwner(){ return owner; }

        public void deposit(double amount){
            if(amount > 0) balance += amount;
        }

        public boolean withdraw(double amount){
            if(amount > 0 && amount <= balance){
                balance -= amount;
                return true;
            }
            return false;
        }

        public double getBalance(){ return balance; }
    }

    public static void main(String[] args){
        Account acc = new Account("Abhishek", 1000);
        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Owner   : " + acc.getOwner());
        System.out.println("Balance : " + acc.getBalance());
        System.out.println("Field is private -> data can only change through controlled methods");
    }
}

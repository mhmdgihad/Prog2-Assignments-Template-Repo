package banksystem;
public class BankSystem {
    public static void main(String[] args) {
        employee myemp = new employee("Mohamed",21,'M',6000,"Btech");
        myemp.Greet();
        myemp.PrintData();
        System.out.println("Salary: " + myemp.getSalary());
        System.out.println("Department: " + myemp.getDepartment());
        
        customer mycus = new customer("Mohamed",21,'M',20206307,"Giza");
        mycus.PrintData();
        
        BankAccount myaccount = new BankAccount(6000);
        System.out.println("Balance: " + myaccount.getBalance());
        myaccount.setBalance(2000);
        System.out.println("Balance: " + myaccount.getBalance());
        myaccount.setBalance(5000,10);
        System.out.println("Balance: " + myaccount.getBalance());
    }
    
}

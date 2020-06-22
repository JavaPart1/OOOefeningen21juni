package OOOef22juni;

public class OefAccount {
    public static void main(String[] args) {
        Account rek = new Account();

        rek.printData();

        Account rek2 = new Account(1122,20000);
        Account.setAnnualIntRate(4.5);

        System.out.println("-------------------------------------------");
        rek2.printData();
        System.out.println("--------------------withdraw-------------------");
        rek2.withdraw();
        rek2.printData();
        System.out.println("--------------------deposit-------------------");
        rek2.deposit();
        rek2.printData();
    }
}

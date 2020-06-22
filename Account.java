package OOOef22juni;

import java.util.Date;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    private int id;
    private double balance;
    private static double annualIntRate = 0;
    private Date dateCreated;
    private static int count = 0;

    Account(){
        this.id = count++;
        this.balance = 0;
        this.dateCreated = new Date();
    }

    Account(int newId,double newBalance){
        this.id = newId;
        this.balance = newBalance;
        this.dateCreated = new Date();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualIntRate() {
        return annualIntRate;
    }

    public static void setAnnualIntRate(double annualIntRate) {
        Account.annualIntRate = annualIntRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInt(){
        return this.balance * (annualIntRate/12/100);
    }

    public void withdraw(){
        System.out.println("Hoeveel wil je opnemen ? ");
        this.balance = this.balance - input.nextDouble();
    }

    public void deposit(){
        System.out.println("Hoeveel wil je storten ? ");
        this.balance = this.balance + input.nextDouble();
    }

    public void printData(){
        System.out.println("Account id : " + this.getId());
        System.out.println("Account balance : " + this.getBalance());
        System.out.println("Account created : " + this.getDateCreated());
        System.out.println("Account interest : " + this.getMonthlyInt());
        System.out.println("Interest rate : " + getAnnualIntRate());
    }
}

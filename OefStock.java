package be.vdab;

import java.util.Scanner;

public class OefStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stock oracle = new Stock("ORCL","Oracle");

        // Vraag Stockprices
        oracle.setPrevCurrentPrice(34.35);
        System.out.println("New price : ");
        oracle.setCurrentPrice(input.nextDouble());

        // Screen ouput
        System.out.println("Stock symbol : " + oracle.getSymbol() + " name : "
                + oracle.getName());
        System.out.println("Previous price : " + oracle.getPrevCurrentPrice());
        System.out.println("Current price : " + oracle.getCurrentPrice());
        System.out.println("% change : " + oracle.getChangePercent());


    }
    public static class Stock {
        private String symbol;
        private String name;
        private double prevCurrentPrice;
        private double currentPrice;

        Stock(String newSymbol, String newname){
            this.setSymbol(newSymbol);
            this.setName(newname);
            //this.symbol = newSymbol;
            //this.name = newname;
        }

        public String getSymbol() {
            return symbol;
        }

        public String getName() {
            return name;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrevCurrentPrice() {
            return prevCurrentPrice;
        }

        public double getCurrentPrice() {
            return currentPrice;
        }

        public void setPrevCurrentPrice(double prevCurrentPrice) {
            this.prevCurrentPrice = prevCurrentPrice;
        }

        public void setCurrentPrice(double currentPrice) {
            this.currentPrice = currentPrice;
        }

        public double getChangePercent(){
            return ((this.currentPrice/this.prevCurrentPrice) - 1) * 100;
        }


    }
}

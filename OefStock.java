package be.vdab;

import java.util.Scanner;

public class OefStock {
    // Main methode mag in een 'StockApp.java' apart van de model-klasse.
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
            // Binnen de klasse stock is het wel toegelaten om rechtstreeks met de instance vars te werken. Daarvoor dient 'private'.
            // Zie hoe getters en setters gegenereerd worden, ook met de inst vars rechtstreeks.
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
            // geen naamverwarring mogelijk hier dus this this niet nodig.
            return ((this.currentPrice/this.prevCurrentPrice) - 1) * 100;
        }


    }
}

package test.design.patterns.structural.adapter;

public class MarketService {
    public void buyProduct() {
        System.out.println("Buy an 100 apple");
    }

    public void sellProduct() {
        System.out.println("Sell an 100 orange");
    }

    public void getBonusClient() {
        System.out.println("Your bonus is $10");
    }
}

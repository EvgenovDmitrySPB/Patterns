package test.design.patterns.structural.adapter;

public class AdapterMarketToClient extends MarketService implements Client {
    public void buy() {
        buyProduct();
    }

    public void sell() {
        sellProduct();
    }

    public void getBonus() {
        getBonusClient();
    }
}

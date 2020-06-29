package test.design.patterns.structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        System.out.println("******** pattern Adapter ****************");
        Client client = new AdapterMarketToClient();

        client.buy();
        client.getBonus();
        client.sell();
        System.out.println("******** end of pattern Adapter ****************");
    }
}

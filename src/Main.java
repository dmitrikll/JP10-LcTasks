import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        BuySellStock buyStock = new BuySellStock();

        System.out.println(buyStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(buyStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
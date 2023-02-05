public class Main {
    public static void main(String[] args)
    {
        double priceOfPurchase = 355;
        double salesTax = .05;
        double finalCost;
        double taxTotal;

        finalCost = priceOfPurchase * salesTax;
        finalCost = priceOfPurchase + finalCost;
        taxTotal = finalCost - priceOfPurchase;


        System.out.println("The price of your purchase is " + priceOfPurchase + "$. The amount of tax is " + taxTotal + "$. The total cost is " + finalCost + "$");







    }
}
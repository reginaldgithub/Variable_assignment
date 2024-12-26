public class fruits {
    private static double Sellingprice;
    private static double Buyingprice;
    private static double Profit;

    public static void main(String[] args){
        Mangoprofit();
        Orangeprofit();
    }
    private static void Mangoprofit(){
        Buyingprice = 100;
        Sellingprice = 200;
        Profit = Sellingprice - Buyingprice;
        System.out.println("Mango profit is:" + " " + Profit);
    }
    private static void Orangeprofit(){
        Buyingprice = 80;
        Sellingprice = 160;
        Profit = Sellingprice - Buyingprice;
        System.out.println("Orange profit is:" + " " + Profit);
    }
}
//  Question.

/* we want to showcase the profit of fruits i.e the
fruits include Mango and Orange/*
 */

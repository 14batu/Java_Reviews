package week05_review;

public class PizzaClient {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.setInfo("small",4,3,4);


        Pizza pizza2 = new Pizza();
        pizza2.setInfo("medium",2,2,5);


        Pizza pizza3 = new Pizza();
        pizza3.setInfo("large",10,3,3);

        System.out.println(pizza1.calcCost());
        System.out.println(pizza2.calcCost());
        System.out.println(pizza3.calcCost());

    }



}

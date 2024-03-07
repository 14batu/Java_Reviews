package week11_review.encapsulation;

public class itemClients {
    public static void main(String[] args) {
        item item1 = new item("Apple", 1.99, 5);
        System.out.println(item1);
        item1.setName("Banana");
        System.out.println(item1);
        item1.setUnitPrice(2.99);
        System.out.println(item1);
        item1.setQuantity(10);
        System.out.println(item1);

        item item2 = new item("Orange", 1.49, 3);
        System.out.println(item2);
        item2.setName("Grape");
        System.out.println(item2);
        item2.setUnitPrice(3.49);
        System.out.println(item2);
        item2.setQuantity(6);
        System.out.println(item2);

        //throw error
        item2.setName("123");
        item2.setUnitPrice(-1);
        item2.setQuantity(-1);



    }
}

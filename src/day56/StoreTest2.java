package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {
    public static void main(String[] args) {
        List<Product> lst = Arrays.asList(new Product("cookie",3),
                new Product("tea",3),
                new Product("coffee",7),
                new Product("muffins",5));
        Store s2 = new Store("Denis Store",lst);
        s2.addProduct(new Product("CheeseCake", 10));
       // System.out.println("s2 = " +s2);
        s2.displayProducts();
    }
}

package day56;

import day55.Practice;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;
  private  List<Product>allProducts;

public Store(){

    this.name ="Cybertek Store";
    this.allProducts = new ArrayList<>();
}

    public Store(String name, List<Product> otherList) {
        this();
        this.name=name;
        allProducts.addAll(otherList);
    }

    public void addProduct(Product p){
        System.out.println("calling addProducts(Product p)");
    allProducts.add(p);

    }
    public void addProduct(String productName, int productPrice){

    allProducts.add(new Product(name, productPrice));


    }


    public void displayProducts(){

        System.out.println(name+"'s Store has below products");
        for (Product each: allProducts) {
            System.out.println("\t each= "+each);

        }
    }
    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}

package day41;

public class Product {
     private String name;
     private double price;

    public String getName(){
       return this.name;
    }public void setName(String name){

        this.name =name;
    }
    public double getPrice(){
        return price;
    }public void setPrice(double price){
        if(price>0) {
            this.price = price;
        }else{
            System.out.println("Invalid Price");
        }
    }

}

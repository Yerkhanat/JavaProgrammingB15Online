package day12;

public class CarShopping {
    public static void main(String[] args) {
        // buy corolla or Tesla (only if it is within budget)
     String carBrand = "tesla";
     int budget = 40000;
     int carPrice = 36000;
    if(carBrand.equals("corolla")  ){
         System.out.println("CAR Aquired");
     }else if(carBrand.equals("tesla") && carPrice<=budget ){
            System.out.println("Car AQUIRED");
     }
    }
}

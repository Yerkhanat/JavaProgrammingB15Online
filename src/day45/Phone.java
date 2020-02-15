package day45;

public class Phone extends Electronic {

    double size;
    double price;

    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size = 9.5;
        p1.price = 399;
        p1.brand = "apple";
        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        p1.showBrand();
        displayUseElectricity();
        Electronic.displayUseElectricity();

    }
}

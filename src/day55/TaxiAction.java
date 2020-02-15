package day55;

public class TaxiAction {
    public static void main(String[] args) {

        Taxi t1 = new Taxi(253,new Engine("v6", 1000), new Driver("Yerkhanat",8999));
        System.out.println(t1);
        System.out.println("Driver name is "+t1.dr.name.charAt(0));

    int x = t1.plateNumber;
    Driver y = t1.dr;
        System.out.println("horse power ="+ t1.eng.getHorsePower());
    }





}

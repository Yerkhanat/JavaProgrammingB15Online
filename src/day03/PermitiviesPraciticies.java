package day03;

public class PermitiviesPraciticies {
    public static void main(String[] args) {

        byte letterCount = 26;
        short sheepCount = 300;
        int catCount = 20;
        long mileToSun = 1000000L;
        long mileToMoon = 5000000l;

        //--------floating number

        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;
        // ----------- larger floating point numbers---------

        double priceOfIpad1 = 355.99d;
        double priceOfIpadPro = 1024.99D;
        // compiler automatically assum it is a double. However for good programming have it add them always
        double priceofMac = 2299.99;


      // if you have a whole number by itself (10 or 100) complier automatically assume it;s an int
        // if you have a fractional number itself, complier automatically assume it is a double

        System.out.println("letter count is "+ letterCount);
        System.out.println("Sheep count is  "+ sheepCount);
        System.out.println("Cat count is " + catCount);
        System.out.println("Mile to sun is " + mileToSun+"km");
        System.out.println("Mile to moon is " + mileToMoon+"km");
        System.out.println("Price of banana for 1 lb is $" + priceOfBanana);
        System.out.println("Price of potato for 1 lb is $" + priceOfPotato);
        System.out.println("Price for ipad 1 is $" + priceOfIpad1);
        System.out.println("Price of ipadPro is $" + priceOfIpadPro);
        System.out.println("Price of Mac is $" + priceofMac);






    }
}

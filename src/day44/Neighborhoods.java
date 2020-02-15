package day44;

public class Neighborhoods {

    public static void main(String[] args) {

        CyberHouse ch1 =  new CyberHouse(11,"Duplex");
        ch1.setNeighbourhoodName("Cybertek Ave");
        CyberHouse ch2 =  new CyberHouse(12,"Log Cabin");
        CyberHouse ch3 =  new CyberHouse(13,"Townhouse");
        CyberHouse ch4 =  new CyberHouse(14,"Cottage");
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        ch2.showAllInfo();
        CyberHouse.showNeighbourhood();

        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);




    }


}

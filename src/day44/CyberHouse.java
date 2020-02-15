package day44;

public class CyberHouse {
    int houseNumber;
    String design;
    private static String neighbourhoodName;

    public static void setNeighbourhoodName(String neighbourhoodName) {
        CyberHouse.neighbourhoodName = neighbourhoodName;
    }

    public CyberHouse(int houseNumber, String design) {
        this.houseNumber = houseNumber;
        this.design = design;

    }
    public  void showAllInfo(){
        System.out.println("House number is "+houseNumber+
                ". House design is "+ design+
                ". Neighbourhood is "+neighbourhoodName);
    }
    public static void showNeighbourhood(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);

    }



    @Override
    public String toString() {
        return "CyberHouse{" +
                "houseNumber=" + houseNumber +
                ", design='" + design + '\'' +
                ", neighborhood='" + neighbourhoodName + '\''+
        '}';
    }
}

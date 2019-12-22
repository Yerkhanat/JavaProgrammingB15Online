package day30;

public class CarInInventory {
    public static void main(String[] args) {
        String [] CarInventory={ "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        int countChev=0;
        int countCivic=0;
        String currentCar;
        for (int i = 0; i < CarInventory.length; i++) {
            currentCar=CarInventory[i];
            if (currentCar.contains("Chevrolet")){
                countChev++; }
            if (currentCar.contains("Civic")){
                countCivic++; } }
        System.out.println("countCivic = " + countCivic);
        System.out.println("countChev = " + countChev);

    }
}

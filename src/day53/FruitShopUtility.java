package day53;

public class FruitShopUtility {

    public static void main(String[] args) {
        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        digestBetter(f2);
        System.out.println(getMyFavoriteFruit());

    }

    public static void displayFruit(Fruit anyFruit){

        System.out.println("Display fruit \n"+ anyFruit.toString());
    }

    public static void digestBetter(Fruit otherFruit){

        otherFruit.getDigested();
        otherFruit.getDigested();
        otherFruit.getDigested();
        otherFruit.getDigested();

        displayFruit(otherFruit);
        System.out.println(getFavouriteByType(1));
    }

    public static Fruit getMyFavoriteFruit(){

        return new Apple ("sweet", "red","aport");
    }
    public static Fruit getFavouriteByType(int type){
        if(type ==1 ){
            return new Orange("sour","orange",12);
        }else if(type == 2){
            return new Apple("tasteless","red", "Golden");

        }return null;


    }

}

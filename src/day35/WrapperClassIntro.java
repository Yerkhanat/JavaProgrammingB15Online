package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int x = 10;
        // primitive data type are pure value has no attribute or behaviour
        // each primitive type has wrapper class that turn it into object so we can treat it
        // this is the old way of create Integer object
        Integer x0bj1= new Integer(12);
        Integer xObj2 = Integer.valueOf(12);
        Integer xObj3 = Integer.valueOf("12");
        byte bValue = xObj2.byteValue();
        System.out.println(bValue);


    }
}

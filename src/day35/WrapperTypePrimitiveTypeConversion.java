package day35;

public class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {
        Integer num1 = 100;
        System.out.println(Float.parseFloat("3.14f"));
        int num2 = Integer.valueOf("200");
//        System.out.println(num1.compareTo(80));
        int num3 = Integer.parseInt("200");
        /*
        *
        * Integer.valueOf(numbersHere)
        * it return an int value
        * Integer.parseInt("numberHere")
        * it return an Integer Object by wrapping up the number
        *
         */
    String caseNumber = "IPR2012-00001";

        System.out.println(getYearOurOFCaseNumber(caseNumber));

    } public static int getYearOurOFCaseNumber(String caseNumber){
 // do validation on case number
        // TODO : Case number should always start with  either
        // CBM, IPR, PGR, DER
        String validation = caseNumber.substring(0,3);
//        If((validation.equals("CBM") || validation.equals("IPR") || validation.equals("PGR")||validation.equals("DER")){
           return Integer.parseInt(caseNumber.substring(3, 7));
    }

    }


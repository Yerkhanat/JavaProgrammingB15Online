package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double [] prices ={99.23 , 11.99, 100.23, 99.99, 56.34};
        //for (dataTypeOfYourArray variableNameForEachItem : yourArrayVariable)
// {
//
//  do something with you array
//
// }
//        for (int i = 0; i <prices.length; i++) {
//            double eachPrice = prices[i];
//            System.out.println("Each price: "+eachPrice);
//        }
        for ( double eachPrice :prices    ){
            System.out.println("each prices: "+ eachPrice);

        }


    }
}

package repl;

public class Repl187 {
    public static String lameDb(String db, String op,String id,String data)
    {
        String[] allWords = db.split("#");
       String result = "";
        if(op.equals("add")){
            for (int i = 0; i <=allWords.length ; i++) {
             if(i==Integer.parseInt(id)){
                 result +=i+data+"#";
             }else if(i+1==Integer.parseInt(id)){

                 result+="#"+(i+1)+data;
             } else if(i==allWords.length-1){

                 result+=allWords[i];
             }else {

                 result += allWords[i] + "#";
             }

            }
        }  if(op.equals("edit")){
        for (int i = 0; i < allWords.length ; i++) {

            if(i==Integer.parseInt(id)-1){
               if(i==allWords.length-1) {
                   result += (i + 1) + data ;
               }else {
                   result += (i + 1) + data+"#";
               }

            }else if(i==allWords.length-1){
                result+=allWords[i];
            } else {
                result+=allWords[i]+"#";
            }


        }
        }

        if(op.equals("delete")) {

            for (int i = 0; i <allWords.length ; i++) {

                if(i==Integer.parseInt(id)-1){
                    continue;
                }else if(i==allWords.length-1) {

                    result+=allWords[i];
                }else {
                    if(i==Integer.parseInt(id)-2){
                        result+=allWords[i];
                    } else {
                        result+=allWords[i]+"#";
                    }
                    }

                }

            }return result;





    }//end lameDb


    public static void main(String[] args)
    {


        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","3","bbb")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo#4abc","delete","4","")+"\n"
        );
//
//        System.out.print(
//                lameDb("1tst#2bla#3foo","none","1","")+"\n"
//        );

    }



}

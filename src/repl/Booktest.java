package repl;

public class Booktest {
    public static void main(String[] args) {
//        String title = "mArufJon";
//        System.out.println(title.substring(0,1).toUpperCase()+title.substring(1).toLowerCase());
//        String capitalize = "the Chronicles OF TrumP";
//        String [] allWords = capitalize.split(" ");
//        String word = allWords[0].substring(0,1).toUpperCase()+allWords[0].substring(1).toLowerCase();
//        for (int i = 1; i <allWords.length ; i++) {
//
//            if(!Book.isTitleWord(allWords[i])){
//                word +=" "+allWords[i].substring(0,1).toUpperCase()+allWords[i].substring(1).toLowerCase();
//
//            }else {
//
//                word+=" "+allWords[i].toLowerCase();
//            }
//
//
//        }
//        System.out.println(word);

        Book b1 = new Book(10,"YerhDn DHd","The trump birdene",12);
         b1.setTitle("MaruF The cool");
        System.out.println(b1.getTitle());
        System.out.println(b1);





    }
}

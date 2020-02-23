package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFIlePractice {
    public static void main(String[] args) throws IOException {
        Map<Integer,String> idNamePair = new HashMap<>();
        List<String> allData = Files.readAllLines(Paths.get("src/day63/Employee.tt"));
        for (String each :allData) {
            System.out.println("each = " + each);

            idNamePair.put(Integer.parseInt(each.split(",")[0]),each.split(",")[1]);

        }
        System.out.println(idNamePair);








    }
}

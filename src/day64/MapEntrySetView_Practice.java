package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView_Practice {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();

            employeeMap.put("Ddene", "Female");
            employeeMap.put("Winfred", "Male");
            employeeMap.put("Jereme", "Male");
            employeeMap.put("Glad", "Female");
            employeeMap.put("Desirae", "Female");
            employeeMap.put("Kakalina", "Female");
            employeeMap.put("Bertrando", "Male");
            employeeMap.put("Ajay", "Female");
            employeeMap.put("Brigitte", "Female");
            employeeMap.put("Derk", "Male");
            employeeMap.put("Orlando", "Male");
            employeeMap.put("Selle", "Female");
            employeeMap.put("Marika", "Female");
            employeeMap.put("Griffy", "Male");
            employeeMap.put("Shanon", "Female");
            employeeMap.put("Clerkclaude", "Male");
            employeeMap.put("Rickard", "Male");
            employeeMap.put("Job", "Male");
            employeeMap.put("Aida", "Female");
            employeeMap.put("Alonzo", "Male");

        Set<Map.Entry<String, String>> workPlace = employeeMap.entrySet();

        for (Map.Entry<String, String> each :workPlace ) {
            if(each.getValue().equals("Female")){
                System.out.println("Female Employee names = " + each.getKey());
            }

        } for(Map.Entry<String, String> each1 : workPlace){

            if(each1.getValue().equals("Male")){

                each1.setValue("King");
            }else {
                each1.setValue("Queen");
            }

        }System.out.println(workPlace);







    }




    }


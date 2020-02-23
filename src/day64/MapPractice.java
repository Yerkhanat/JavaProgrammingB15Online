package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, List<String>> groupMap = new HashMap<>();
        groupMap.put("Achievers", Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like",
                "Aytem", "Yerkhanat"));
        groupMap.put("PowerOf4", Arrays.asList("Furkan", "Daria", "Serife", "Muge"));
        groupMap.put("BugHunter", Arrays.asList("Ayse", "Rabiyam", "Gulzina"));
        groupMap.put("BugBusters", Arrays.asList("Rukhshona", "Fariza", "Seyma", "Sumeyyra", "Huvayda"));

        System.out.println(groupMap);
        groupMap.forEach((groupcode, allMembers) -> System.out.println("group code " + groupcode + " all members = " + allMembers));

        System.out.println(groupMap.get("Achievers").get(3));

        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));

        Set<Map.Entry<String, List<String>>> entryView = groupMap.entrySet();

        for (Map.Entry<String, List<String>> each : entryView) {

            if(each.getValue().contains("Gulzina")){
                System.out.println("Guzlina is in group =  "+ each.getKey());
            }
        }



        
    }
}
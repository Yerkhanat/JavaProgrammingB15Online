package day27;

public class FindLongestWord {
    public static void main(String[] args) {
        String [] developers = {"Vladislava", "Hasan", "Tolkun", "Abide"};
        String [] testerTeam = {"Zhibkechach", "Mohammed Sohrabi", "Nursultan"};
        String [] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String [] [] scrumTeam = {developers, testerTeam,businessAnalystTeam};
        String longestName = scrumTeam[0][0];

        for (String[] eachArray: scrumTeam
             ) {
            for (String each :eachArray) {
                if(longestName.length()<each.length()){
                    longestName = each;
                }
            }

        }
        System.out.println("Your teammate \""+longestName+"\" has the longest name.");

    }
}

package homeworks.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    private static final HashMap<Integer, String> hashFootball = new HashMap<>();
    private static final List<FootballTeamMember> footballTeamMember = new ArrayList<>();

    public static void main(String[] args) {
//        System.out.println(removeFromMap(hashFootball, 80));
        FootballTeamMember footballTeamMember1 = new FootballTeamMember(7, "Torres");
        FootballTeamMember footballTeamMember2 = new FootballTeamMember(8, "Xavi");
        FootballTeamMember footballTeamMember3 = new FootballTeamMember(9, "Sanches");
        footballTeamMember.add(footballTeamMember1);
        footballTeamMember.add(footballTeamMember2);
        footballTeamMember.add(footballTeamMember3);
        System.out.println(createFootballTeam(footballTeamMember));
//        for (FootballTeamMember arg : footballTeamMember) {
//            System.out.println(arg.getNumber());
//            System.out.println(arg.getName());
//        }
//        for (FootballTeamMember teamMember : footballTeamMember) {
//            System.out.println(teamMember);
//        }
        printAllMemberNames(hashFootball);
        printAllMembers(hashFootball);

    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        for (FootballTeamMember member : members) {
            hashFootball.put(member.getNumber(), member.getName());
        }
        return hashFootball;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        hashFootball.put(1, "a");
        hashFootball.put(2, "b");
        hashFootball.put(3, "c");
        for (Integer integer : memberMap.keySet()) {
            if(integer.equals(removedNumber)){
                hashFootball.remove(removedNumber);
                return true;
            }
        }
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        for (String value : memberMap.values()) {
            System.out.println(value);
        }

    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Map.Entry<Integer, String> entry : memberMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "FootballTeamMember{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
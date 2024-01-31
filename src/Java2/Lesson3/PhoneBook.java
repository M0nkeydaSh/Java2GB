package Java2.Lesson3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {
        Map<String, String> tb = new HashMap<>();
        add(tb, "89991122345", "Chobotenko");
        add(tb, "88354012845", "Doterov");
        add(tb, "84362956375", "Smetanuke");
        add(tb, "80274992642", "Monkey");
        add(tb, "87463772832", "Negmetov");
        add(tb, "89453217698", "Gorilla");

        System.out.println(tb);

        get(tb,"Monkey");

    }

        public static void add(Map <String, String> tb, String number, String sureName){
        tb.put(number, sureName);
        }
        public static void get(Map <String, String> tb, String sureName){
            for (Map.Entry<String, String> item : tb.entrySet()) {
                if (item.getValue().equals(sureName)) {
                    System.out.println(item.getValue() + " : " + item.getKey());
                }
            }

        }








}

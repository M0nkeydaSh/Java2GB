package Java2.Lesson3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] arrStr = new String[]{"Пудж", "Фурион", "Квопа", "Морфлинг", "Фурион", "Пудж", "Луна", "Мирана", "Дк", "Бара", "Фурион", "Пудж", "Пудж"};
        Set<String> unicSet = new TreeSet<>(List.of(arrStr));
        System.out.println(unicSet);
        unicSet.clear();
        List<String> list = new ArrayList<>(List.of(arrStr));
        for (int i = 0; i < list.size(); i++) {
            int countOfReplay = 0;
            for (String s : list) {
                if (list.get(i).equals(s)) {
                    countOfReplay++;
                }
            }
            unicSet.add(list.get(i) + " - " + countOfReplay);
        }
        System.out.println(unicSet);
    }
    }



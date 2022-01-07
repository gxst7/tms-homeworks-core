package com.tms.lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoMain {

    public static void main(String[] args) {

        Family family1 = new Family("jones", 115000, Arrays.asList(
                new Member("alexa", Sex.FEMALE, 24),
                new Member("stan", Sex.MALE, 27),
                new Member("lily", Sex.FEMALE, 2)
        ));

        Family family2 = new Family("grubber", 185000, Arrays.asList(
                new Member("tiffany", Sex.FEMALE, 33),
                new Member("joe2", Sex.MALE, 35),
                new Member("jack2", Sex.MALE, 11)
        ));

        Family family3 = new Family("williams", 360000, Arrays.asList(
                new Member("samantha", Sex.FEMALE, 55),
                new Member("john2", Sex.MALE, 57),
                new Member("barbara", Sex.FEMALE, 17),
                new Member("gary", Sex.MALE, 22)
        ));

        List<Family> families = Arrays.asList(family1, family2, family3);

        // распечатать всех детей в имени которых есть 2
        families.stream()
                .flatMap(family -> family.getMembers().stream())
                .filter(member -> member.getName().contains("2"))
                .forEach(System.out::println);

        // найти всех родителей у которых детей больше 3
        families.stream()
                .filter(family -> family.getMembers().size() > 3)
                .forEach(System.out::println);

        // вывести всех мальчиков (девочек)
        families.stream()
                .flatMap(family -> family.getMembers().stream())
                .filter(member -> member.getSex() == Sex.MALE)
                .forEach(System.out::println);

        // вывести все имена детей большими буквами (toUpperCase)
        families.stream()
                .flatMap(family -> family.getMembers().stream())
                .map(member -> member.getName().toUpperCase())
                .forEach(System.out::println);

        // найти сколько всего детей у всех родителей
        System.out.println(families.stream()
                .flatMap(family -> family.getMembers().stream())
                .count());

        // создать map, где ключ - имя родителя, а значение - количество детей
        Map<String, Integer> collect = families.stream()
                .collect(Collectors.toMap(Family::getSurname, family -> family.getMembers().size()));

        System.out.println(collect);
    }
}

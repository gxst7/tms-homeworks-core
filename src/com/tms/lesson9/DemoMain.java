package com.tms.lesson9;

import java.util.*;

public class DemoMain {

    public static void main(String[] args) throws NoSuchUserException {

        User u1 = new User("alexa", Sex.FEMALE, 21);
        User u2 = new User("david", Sex.MALE, 30);
        User u3 = new User("greg", Sex.MALE, 17);
        User u4 = new User("pitt", Sex.MALE, 33);
        User u5 = new User("eva", Sex.FEMALE, 29);
        User u6 = new User("tory", Sex.FEMALE, 19);

        List<User> users1 = new ArrayList<>();
        List<User> users2 = new LinkedList<>();

        Set<User> userSet1 = new HashSet<>();
        Set<User> userSet2 = new TreeSet<>(new CompareService());

        Map<String, User> userMap = new HashMap<>();

        SearchService<User> searchEngine = new Searcher();

        // add to ArrayList
        users1.add(u1);
        users1.add(u2);
        users1.add(u3);

        // add to LinkedList
        users2.add(0, u4);
        users2.add(1, u5);
        users2.add(2, u6);

        // add to HashSet
        userSet1.add(u1);
        userSet1.add(u3);
        userSet1.add(u5);

        // add to TreeSet
        userSet2.add(u2);
        userSet2.addAll(userSet1);
        userSet2.retainAll(users1);
        userSet2.add(u6);
        userSet2.remove(u3);

        // add to HashMap
        userMap.put("first", u1);
        userMap.put("second", u2);
        userMap.put("third", u3);

        // create iterator
        Iterator<User> iterator = users1.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            System.out.println("User -> " + u);
            System.out.println(u.hashCode());
        }

        System.out.println();

        iterator = users2.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            System.out.println("User -> " + u);
            System.out.println(u.hashCode());
        }

        System.out.println();

        iterator = userSet1.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            System.out.println("User -> " + u);
            System.out.println(u.hashCode());
        }

        System.out.println();

        iterator = userSet2.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            System.out.println("User -> " + u);
            System.out.println(u.hashCode());
        }

        System.out.println();

        User usr;
        Collection<User> usrs;

        // search by name
        try {
            usr = searchEngine.searchByName(userSet2, "alexa");
            System.out.println(usr);
        } catch (NoSuchUserException e) {
            System.out.println(e.getMessage());
        }

        // search by sex
        try {
            usrs = searchEngine.searchBySex(users1, Sex.MALE);
            System.out.println(usrs);
        } catch (NoSuchUserException e) {
            System.out.println(e.getMessage());
        }

        // get sorted collection by age
        System.out.println(userSet2);
    }
}

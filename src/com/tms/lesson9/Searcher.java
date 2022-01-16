package com.tms.lesson9;

import java.util.ArrayList;
import java.util.Collection;

public class Searcher implements SearchService<User> {

    @Override
    public User searchByName(Collection<User> userList, String name) throws NoSuchUserException {
        for (User user : userList) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        throw new NoSuchUserException("There is no such user");
    }

    @Override
    public Collection<User> searchBySex(Collection<User> userList, Sex sex) throws NoSuchUserException {
        Collection<User> users = new ArrayList<>();
        for (User user : userList) {
            if (user.getSex() == sex) {
                users.add(user);
            }
        }
        if (users.isEmpty()) throw new NoSuchUserException("There are no such users");
        return users;
    }

    public Collection<User> sortByAge(Collection<User> userList) throws NoSuchUserException {
        return userList;
    }
}

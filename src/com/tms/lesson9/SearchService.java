package com.tms.lesson9;

import java.util.Collection;

public interface SearchService<T> {

    T searchByName(Collection<T> userList, String name) throws NoSuchUserException;

    Collection<T> searchBySex(Collection<T> userList, Sex sex) throws NoSuchUserException;

    Collection<T> sortByAge(Collection<T> userList) throws NoSuchUserException;
}

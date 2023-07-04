package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private int id;
    private String name;
    private int age;
    private boolean isActive;
    
    public User(int id, String name, int age, boolean isActive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }
    
    
    public static List<User> findUniqueByName(List<User> users) {
        Set<String> uniqueNames = new HashSet<>();
        List<User> uniqueUsers = new ArrayList<>();
        for (User user : users) {
            if (!uniqueNames.contains(user.name)) {
                uniqueNames.add(user.name);
                uniqueUsers.add(user);
            }
        }
        return uniqueUsers;
    }
}
package com;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "Alice", 25, true),
                new User(2, "Bob", 30, false),
                new User(3, "Charlie", 35, true),
                new User(4, "Alice", 40, false),
                new User(5, "David", 45, true),
                new User(6, "Bob", 50, false)
        );
        
        List<User> uniqueUsers = User.findUniqueByName(users);
        for (User user : uniqueUsers) {
            System.out.println(user.id + " " + user.name + " " + user.age + " " + user.isActive);
        }
    }
}
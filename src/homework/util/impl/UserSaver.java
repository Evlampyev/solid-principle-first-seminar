package homework.util.impl;

import homework.User;

public class UserSaver {
    public static void save(User user) {
        System.out.println("Запись: " + user.getName());
    }
}

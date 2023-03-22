package homework;

import homework.util.impl.UserSaver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Вано");
        user.report();
        UserSaver.save(user);
    }
}
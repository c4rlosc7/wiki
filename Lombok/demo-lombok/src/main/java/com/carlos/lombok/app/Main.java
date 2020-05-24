package com.carlos.lombok.app;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1L);
        user.setName("Carlos Martinez");

        System.out.println("***LOMBOK***");
        System.out.println("ID: " + user.getId());
        System.out.println("NAME: " + user.getName());
    }
}

package by.courses.java.streamapi;
import by.courses.java.streamapi.operation.DefaultStream;


import by.courses.java.streamapi.entity.UserBase;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UserBase> flag = new ArrayList<>();
        flag.add(UserBase.of("Timmoty", 21));
        flag.add(UserBase.of("Valentin", 48));
        flag.add(UserBase.of("Timofey", 56));
        DefaultStream defaults = new DefaultStream();
        System.out.println(defaults.isCharacterPresentInAllNames(flag,"ig"));
    }
}
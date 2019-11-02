package by.courses.java.streamapi;
import by.courses.java.streamapi.operation.DefaultStream;


import by.courses.java.streamapi.entity.UserBase;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UserBase> flag = new ArrayList<>();
        flag.add(UserBase.of("Igor", 19));
        flag.add(UserBase.of("Sashaig", 18));
        flag.add(UserBase.of("Kirigll", 20));
        DefaultStream df = new DefaultStream();
        System.out.println(df.isCharacterPresentInAllNames(flag,"ig"));
    }
}
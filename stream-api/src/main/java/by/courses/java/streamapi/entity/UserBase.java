package by.courses.java.streamapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor(staticName = "of")
public class UserBase {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserBase)) return false;
        UserBase userBase = (UserBase) o;
        return age == userBase.age &&
                name.equals(userBase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "UserBase : " +
                "name = "  + name +
                ", age = " + age +
                ';';
    }
}
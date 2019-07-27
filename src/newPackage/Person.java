package newPackage;

import java.util.Scanner;

/**
 * Created by Unknown 2 on 03-Oct-16.
 */
public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static int sequentialSearch(String key, Person[] person, int n){
        for (int h = 0; h < n; h++)
            if (key.equalsIgnoreCase(person[h].name))
                return h;
        return -1;
    }


}
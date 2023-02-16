package model;

public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + "," + age;
    }
    public Student (String fullName ){
        String [] split = fullName.split("-");
        name=split[0];
        age = Integer.parseInt(split[1]);
    }

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
}

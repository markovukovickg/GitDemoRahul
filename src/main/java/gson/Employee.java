package gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashSet;

//POJO - Plain Old Java Object
public class Employee {
    @Expose
    @SerializedName("firstName")
    private String name;
    @Expose
    @SerializedName("lastName")
    private String surname;
    @Expose(serialize = false)
    private Integer age;
    @Expose(deserialize = false)

    private Double salary;
    @Expose
    private String position;
    @Expose
    private HashSet<String> skills;

    //Constructor

    public Employee(String name, String surname, int age, double salary, String position, HashSet<String> skills) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.skills = skills;
    }

    public Employee(String name, String surname, int age, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.skills = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public HashSet<String> getSkills() {
        return skills;
    }

    public void setSkills(HashSet<String> skills) {
        this.skills = skills;
    }

    public boolean hasSkill(String skill) {
        return skills.contains(skill);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void removeSkill(String skill) {
        skills.remove(skill);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + getFullName() + '\'' +
                ", Age=" + getAge() +
                ", Salary=" + getSalary() +
                ", Position='" + getPosition() + '\'' +
                ", Skills=" + getSkills() +
                '}';
    }
}

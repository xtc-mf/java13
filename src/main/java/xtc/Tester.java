package xtc;

import java.rmi.Naming;
import java.sql.SQLData;

public class Tester {
    public String name;
    public String surname;
    public int exp;
    public char englishLevel;
    public double salary;

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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public char getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(char englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Tester(String n, String s) {
        this.name = n;
        this.surname = s;
    }

    public Tester(String n, String s, int e) {
        this(n, s);
        this.exp = e;
    }

    public Tester(String n, String s, int e, char level, double sal) {
        this(n, s, e);
        this.englishLevel = level;
        this.salary = sal;
    }

    public String showInfo(String name, String surname) {
        return "Name: " + name + ";\nSurname: " + surname + ";\n";
    }

    public String showInfo(String name, String surname, int exp) {
        return "Name: " + name + ";\nSurname: " + surname + ";\n" + "Experience: " + exp + ";\n";
    }

    public String showInfo(String name, String surname, int exp, char englishLevel, double salary) {
        return "Name: " + name + ";\nSurname: " + surname + ";\n" +
                "Experience: " + exp + ";\n" + "English level: " + englishLevel + ";\n" +
                "Salary: " + salary + ".\n";
    }

    public static void write() {
        System.out.printf("Static method");
    }
}

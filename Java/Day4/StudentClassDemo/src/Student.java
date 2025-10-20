package bean;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private float m1;
    private float m2;
    private Date birthDate;

    public Student() {
        this.id = 0;
        this.name = "";
        this.m1 = 0.0f;
        this.m2 = 0.0f;
        this.birthDate = new Date();
    }

    public Student(int id, String name, float m1, float m2, Date birthDate) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.birthDate = birthDate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name != null ? name : "";
    }

    public void setM1(float m1) {
        this.m1 = m1;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate != null ? birthDate : new Date();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getM1() {
        return m1;
    }

    public float getM2() {
        return m2;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Marks1: %.2f, Marks2: %.2f, Birth Date: %s",
                id, name, m1, m2, birthDate);
    }
}
    



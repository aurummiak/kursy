package Lessons.lesson17.model;

public class Student {
    public static final int MIN_AGE_STUDENT = 16;
    public static final int MAX_AGE_STUDENT = 80;

    private String name;
    private int age;
    private double mark;
    private boolean alive;

    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    public Student(String name, int age, double mark, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;
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
        if (age >= MAX_AGE_STUDENT || age <= MIN_AGE_STUDENT) {
            this.age = age;
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
        }
    }


    public void setAlive() {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        return name + ": age = " + age +
                ", mark = " + mark +
                ", is alive = " + (alive ? "yes" : "no");
    }

}
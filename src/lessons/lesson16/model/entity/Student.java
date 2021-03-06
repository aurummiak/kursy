package lessons.lesson16.model.entity;

public class Student {
    public String name;
    public int age;
    public double mark;
    public char sex;
    public boolean alive;

    public Student() {
        System.out.println("Create Student object");
    }

    public Student(String name, int age, double mark, char sex, boolean alive) {
        this();
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.sex = sex;
        this.alive = alive;
    }

    // copy-constructor
    public Student(Student student) {
        this(student.name, student.age,student.mark,
                student.sex, student.alive);
    }

    public void testing(){
        System.out.println(this.hashCode());
    }

    // default constructor
//    public Student() {
//        name = "no name";
//        age = 16;
//        alive = true;
//        sex = 'f';
//    }

    // constructor with args (params)
//    public Student(String name, int age, double mark, char sex, boolean alive) {
//        this.name = name;
//        this.age = age;
//        this.mark = mark;
//        this.sex = sex;
//        this.alive = alive;
//    }

//    // constructor with args (params)
//    public Student(String name) {
//        this.name = name;
//    }
//
//    // constructor with args (params)
//    public Student(String name, int age, char sex, boolean alive) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.alive = alive;
//    }
//
//    // constructor with args (params)
//    public Student(boolean alive) {
//        this.alive = alive;
//    }

    public void setName(String name){
        this.name = name;
    }


    public String getInfo() {
        return this.name + " { age = " + this.age
                + "; mark = " + this.mark
                + "; sex = " + (this.sex == 'm' ? "male" : "female")
                + "; alive = " + (this.alive ? "yes" : "no") + " }";
    }
}
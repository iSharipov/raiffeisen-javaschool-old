package ru.raiffeisen.reflection;

public class Student extends PersonBase implements Studying {

    private String grade;
    private String id;

    public Student() {
        super("John", 12);
    }

    public Student(String name, Integer age) {
        super(name, age);
    }

    public Student(String name, Integer age, String grade) {
        this(name, age);
        this.grade = grade;
    }


    public Student(String name, Integer age, String grade, String id) {
        this(name, age, grade);
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public String getName(String name, Integer age) {
        return name;
    }

    public String getName(String lastName) {
        return name + lastName;
    }

    @Override
    public Integer getAge() {
        return age - 10;
    }

    @Override
    public String studyFor() {
        return "JAVA";
    }

    private void smth() {
        //
    }

}


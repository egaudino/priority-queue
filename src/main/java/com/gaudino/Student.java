package com.gaudino;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
            if (cgpa > o.cgpa) {
                return -1;
            } else if (cgpa == o.cgpa) {
                if (name.compareTo(o.name) == 0) {
                    if (id == o.id)
                        return 0;
                    else if (id > o.id)
                        return 1;
                    else
                        return -1;
                } else
                    return name.compareTo(o.name);
            } else {
                return 1;
            }
        }
}

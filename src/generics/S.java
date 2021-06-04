package generics;


import java.util.LinkedList;
import java.util.List;

class Student<T> {
    private String name;
    private int age;
    private double cgpa;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cgpa=" + cgpa +
                '}';
    }

    public double getCgpa() {
        return cgpa;
    }

    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
}

public class S {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        Student mounish = new Student("mounish",26,8.4);
        Student nitin = new Student("nitin",21,7.0);
        Student poojitha = new Student("Poojitha", 24, 7.5);
        list.add(mounish);
        list.add(nitin);
        list.add(poojitha);
        for (Student element:list){
            System.out.println(element);
        }
    }
}

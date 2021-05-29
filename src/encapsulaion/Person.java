package encapsulaion;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        this.name = "";
        this.age = 0;
        this.gender = "";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setAge(int age) {
        if(age>=0) {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

package sets;

import generics.S;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Student<K, V> {
    private K key;
    private V value;

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Student{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public Student(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class App {
    public static void main(String[] args) {
        Comparator<Student<Integer, String>> comparator = new Comparator<Student<Integer, String>>() {
            @Override
            public int compare(Student<Integer, String> o1, Student<Integer, String> o2) {
                if (o1.getKey() < o2.getKey()) {
                    return -1;
                } else if (o1.getKey() > o2.getKey()) {
                    return 1;
                }
                return 0;
            }
        };
        Comparator<Student<Integer, String>> comparator_name = new Comparator<Student<Integer, String>>() {
            @Override
            public int compare(Student<Integer, String> o1, Student<Integer, String> o2) {
                if (o1.getValue().length() < o2.getValue().length()) {
                    return -1;
                } else if (o1.getValue().length() > o2.getValue().length()) {
                    return 1;
                }
                return 0;
            }
        };

        Set<Student<Integer, String>> set = new TreeSet<>(comparator_name);
        set.add(new Student<>(14, "fourteen"));
        set.add(new Student<>(4, "four"));
        set.add(new Student<>(3, "three"));
        set.add(new Student<>(11, "eleven"));


        for (Student<Integer, String> element:set){
            System.out.println(element);
        }
    }
}

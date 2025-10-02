package people;

import java.util.Comparator;
import java.util.Objects;

public class PersonWithComparator {
    final String id;
    String name;
    int age;

    public PersonWithComparator(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public PersonWithComparator(String id, String name) {
        this.id = id;
        this.name = name;
        this.age = 0;
    }

    public String getId() {
        return id;
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonWithComparator person = (PersonWithComparator) o;
        return Objects.equals(getId(), person.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}

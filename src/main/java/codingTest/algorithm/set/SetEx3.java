package codingTest.algorithm.set;

import java.util.HashSet;
import java.util.Objects;

public class SetEx3 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("david", 28));
        set.add(new Person("david", 28));

        System.out.println("set = " + set);
    }





}

class Person{
    //hashset을 이용하려면 반드시 hashCode하고 equals를 재정의해줘야한다
    String name;
    int age;

    //생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Person)) {
            return false;
        }
        Person p = (Person) object;
        // 나자신(this)의 이름과 나이를 p와 비교
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

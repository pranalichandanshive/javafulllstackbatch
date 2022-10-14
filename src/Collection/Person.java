package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;
    private  Integer id;

    public Person(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Person p) {

        System.out.println("age"+age);
        System.out.println("p.age"+p.age);
        return age.compareTo(p.age);
    }
}
class PersonImpl{
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        Person p1=new Person("sonal",21,1);
        Person p2=new Person("hema",25,2);
        Person p3=new Person("minal",11,3);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        System.out.println(personList);
        Collections.sort(personList);
        for(Person person:personList){
            System.out.println(person);
        }
    }
}

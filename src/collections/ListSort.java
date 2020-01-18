package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements  Comparable<Person>{
    private String name;
    private Integer age;

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

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return  this.getName().compareTo(o.getName());
    }
    public  String toString(){
        return "Name"+name+"Age"+age;
    }
}
public class ListSort
{
    public static void main(String[] args) {
        List<Person> ints=new ArrayList<>();
        ints.add(new Person("吕雪",20));
        ints.add(new Person("刘",20));
        ints.add(new Person("耿宏",20));
        ints.add(new Person("味",20));
        ints.add(new Person("张刚",20));
        ints.add(new Person("薛",20));
        ints.add(new Person("唐",20));
        ints.add(new Person("五",20));

        Collections.sort(ints);
        System.out.println();

        ints.sort(new Comparator<Person>(){
            public int compare(Person o1,Person o2) {
                return o2.getAge() - o1.getAge();
            }
            });
            System.out.println("Sorting:"+ints);

        }
    }


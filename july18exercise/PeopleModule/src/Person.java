import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bhirudr on 7/20/2017.
 */
public class Person {
    String name;
    Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    ArrayList creatTestData() {
        Person p1 = new Person("Rajan", Gender.Male);
        Person p2 = new Person("Arshi", Gender.Female);
        Person p3 = new Person("Mahesh", Gender.Male);
        Person p4 = new Person("Mahesh", Gender.Male);
        Person p5 = new Person("Arshi", Gender.Female);
        Person p6 = new Person("Binay", Gender.Male);

        ArrayList people = new ArrayList();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p5);

        return people;

    }

    HashMap<String, Integer> createHashmap(ArrayList<Person> people) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (Person p : people) {
            if (hashMap.containsKey(p.getName())) {
                hashMap.put(p.getName(), (hashMap.get(p.getName()) + 1));
            } else {
                hashMap.put(p.getName(), hashMap.get(p.getName()));
            }
        }
        return hashMap;
    }

    int getNoOfPeopleWithDuplicateName(HashMap<String, Integer> hashMap) {
        int duplicateCount = 0;
        for (String name : hashMap.keySet()) {
            if (hashMap.get(name) > 1) {
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

    @Test
    void testExercise() {
        ArrayList people = creatTestData();
        HashMap<String, Integer> hashmap = createHashmap(people);
        getNoOfPeopleWithDuplicateName(hashmap);
    }
}

  

/**
 * Created by bhirudr on 7/21/2017.
 */
public class Person {
    String name;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, String gender) {
        this.name = name;

        this.gender = gender;
    }
}

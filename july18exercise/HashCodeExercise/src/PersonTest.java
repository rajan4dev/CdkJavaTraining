/**
 * Created by bhirudr on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Rajan","Male");
        Person p2 = new Person("Rajan","Male");
        System.out.println(p1.equals(p2));
    }
}

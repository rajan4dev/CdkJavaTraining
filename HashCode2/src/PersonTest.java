import java.util.HashMap;

/**
 * Created by bhirudr on 7/21/2017.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("Rajan", "Male");
        Person p2 = new Person("Rajan", "Male");
        Person p3 = new Person("raja", "Male");

        System.out.println((p1.getName()+p1.getGender()).hashCode());
        System.out.println(p1.getName().hashCode()+p2.getGender().hashCode());
        System.out.println("=============================");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println("=============================");

        //reflexivity
        System.out.println(p1.equals(p1));
        //symmetric
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));

        //transitive
            System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
        // x.equals(null) should return false
       System.out.println(p1.equals(null));


        String rajan = "Rajan";
        String rj = "Rajan";
        System.out.println("===================================");
        System.out.println(rajan.hashCode());
        System.out.println(rj.hashCode());
        System.out.println(rajan.equals(rj));

        System.out.println("===================================");
        System.out.println(rajan.equals("rajan"));
        System.out.println(rajan.equals("Rajan"));
        System.out.println(rajan.equals(null));

        Object ob = new Object();
        ob.hashCode();
        System.out.println("===================================");

        Integer abc = Integer.valueOf(2);
        System.out.println("");

        System.out.println(Integer.valueOf(1)==Integer.valueOf(1));
        System.out.println(Integer.valueOf(127)==Integer.valueOf(127));
        System.out.println("===================================");
        for(int i=0;i<200;i++) {
            System.out.println("index "+ i + " " +(Integer.valueOf(i)==Integer.valueOf(i)));
        }
        HashMap<String,Person> personHashMap = new HashMap<>();
    }
}

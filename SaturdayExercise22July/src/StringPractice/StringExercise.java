package StringPractice;

/**
 * Created by bhirudr on 7/22/2017.
 */
public class StringExercise {
    public static void main(String[] args) {
       String name3="cdk";
        String name = new String("cdk");
        String name1 = name.intern();
        String name2 = "cdk";
        name="cdk";
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name1 == name2);
        System.out.println(name1 == name2);
        System.out.println(name3==name1);
    }
}

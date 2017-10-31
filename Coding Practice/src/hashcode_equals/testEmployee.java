package hashcode_equals;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by bhirudr on 10/30/2017.
 */
public class testEmployee {
    public void printHashmap(HashMap<Employee,Integer> hashMap){
        Iterator it = hashMap.entrySet().iterator();
        for (Employee key : hashMap.keySet()) {
            System.out.println("key: " + key + " value: " + hashMap.get(key));
        }
    }
    @Test
    public void testHashCodeEquals() {
        HashMap<Employee,Integer> employeeHashMap=new HashMap<>();
        employeeHashMap.put(new Employee("2","rajan"), 1);
        printHashmap(employeeHashMap);
        System.out.println("------------------------------------------------");
        employeeHashMap.put(new Employee("2","rajan"), 2);
        employeeHashMap.put(new Employee("5","rajan"), 3);
        employeeHashMap.put(new Employee("2","rajan"), 4);
        printHashmap(employeeHashMap);

    }

}

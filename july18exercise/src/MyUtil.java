import org.junit.Test;

import java.util.*;

/**
 * Created by bhirudr on 7/19/2017.
 */
public class MyUtil {



    //int sorting
    public static int[] sort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }

        }
         return array;
    }



    //array sorting
    public static Employee[] sort(Employee[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (array[j].empId > array[j + 1].empId) {
                    Employee swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }

        }
        return array;
    }

// ***************************************************************************************
    //array sorting using with behaviour of comparison as parameter
    public static Employee[] sort(Employee[] array, Compare c) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
               // if (array[j].empId > array[j + 1].empId) {
                if (c.compare(array[j],array[j + 1])==1) {
                    Employee swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }

        }
        return array;
    }
// ***************************************************************************************

//arraylist sorting
    public static ArrayList<Employee> sort(ArrayList<Employee> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (arrayList.get(j).getEmpId() > arrayList.get(j + 1).getEmpId()) {
                    Employee e3 = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,e3 );
                }
            }

        }
        return arrayList;
    }





    public static void main(String[] args) {


        Employee[] empArray = Employee.createSampleEmployeeData();

        Compare compareReference = new CompareId();
        Employee[] resultingEmpArray = MyUtil.sort(empArray, compareReference); //MyUtil.sort(empArray);

        for (Employee e : resultingEmpArray) {
            System.out.println(e.toString());
        }

//        ArrayList<Employee> sortedEmployeeList = MyUtil.sort(employeeList);
//        for (Employee e : sortedEmployeeList) {
//            System.out.println(e.toString());
//        }
    }
}

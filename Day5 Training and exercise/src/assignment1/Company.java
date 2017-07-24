package assignment1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by bhirudr on 7/24/2017.
 */
@Retention(RetentionPolicy.CLASS) //refers to the .class file, available to java compiler but not to JVM . It is included in the class file.
@Target(ElementType.TYPE) //annotation can be applied to class, interface or enumeration
@interface Company {
    String name();
    String location();
}

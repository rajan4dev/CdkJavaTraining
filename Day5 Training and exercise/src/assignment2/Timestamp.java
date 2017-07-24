package assignment2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by bhirudr on 7/25/2017.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD, ElementType.LOCAL_VARIABLE,ElementType.CONSTRUCTOR,ElementType.PARAMETER})
public @interface Timestamp {
Day day();
Month month();
Year year();
}

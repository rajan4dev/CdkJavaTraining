import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@interface Author{
	String name();	
}
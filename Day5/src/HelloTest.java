import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bhirudr on 7/17/2017.
 */
public class HelloTest {

    @Test
    public void addtionOfZeroesShouldBeZero(){
        Assert.assertEquals("Addtion should be zero",0, HelloWorld.add(0,0));
    }

    @Test
    public void addtionOfOnesShouldBeTwo(){
        Assert.assertEquals("Addtion should be zero",2, HelloWorld.add(1,1));
    }
}

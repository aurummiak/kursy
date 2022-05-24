import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {
    @Test
    public void test() {

        //arrange
        int a = 10;
        int b = 20;
        int expected = 30;

        //action
        int actual = a + b;

        // assert
        if (expected != actual) {
            Assert.fail();
        }
    }
}

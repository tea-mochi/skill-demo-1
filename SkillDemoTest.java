import static org.junit.Assert.*;
import org.junit.*;

/**javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest */

public class SkillDemoTest {
    @Test
    public void testMultiply(){
        assertEquals(42, SkillDemo.multiply(8,5)); //this fails
    }
}

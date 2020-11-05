import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private Utils utils;

    @Before
    public void setUp() {
        utils = new Utils();
    }

    @Test
    public void fileLoadingTest() {
        String path = utils.getFullPath("C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder\\exampleTxt.txt");
        Assert.assertEquals(path, "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder\\");
    }
}

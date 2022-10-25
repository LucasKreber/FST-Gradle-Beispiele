import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MainTest {

    @Test
    public void toJsonStringTest() {
        Map<Integer, String> colours = new HashMap<>();
        colours.put(1, "blue");
        colours.put(2, "yellow");
        colours.put(3, "green");
	    System.out.println("Test running");
        Assert.assertEquals("{\"1\":\"blue\",\"2\":\"yellow\",\"3\":\"green\"}", Utils.mapToJsonString(colours));
    }

}

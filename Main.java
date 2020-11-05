
public class Main {

    private static final String EXAMPLE_TXT_PATH =
            "C:\\Users\\Lilykos\\workspace\\ApacheCommonsExample\\ExampleFolder\\exampleTxt.txt";

    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println("Full path of exampleTxt: " + utils.getFullPath(EXAMPLE_TXT_PATH));
    }
}

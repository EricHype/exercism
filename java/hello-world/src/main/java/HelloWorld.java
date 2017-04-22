public class HelloWorld {

    public static final String HELLO_FORMAT = "Hello, %s!";
    public static final String DEFAULT_NAME = "World";

    public static String hello(String name) {

        if(null == name || name.isEmpty()){
            name = DEFAULT_NAME;
        }

        return String.format(HELLO_FORMAT, name);
    }
}

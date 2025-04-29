package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public Application() {
        System.out.println("Inside Application");
    }

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Hi");
        greetings.add("Welcome");

        for (String greeting : greetings) {
            System.out.println(greeting);
        }
    }

    public void checkString(String input) {
        if (StringUtils.isBlank(input)) {
            System.out.println("The input string is blank.");
        } else {
            System.out.println("The input string is: " + input);
        }
    }

    public int countWords(String input) {
        if (StringUtils.isBlank(input)) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();
        app.greet();
        app.checkString("Hello, World!");
        app.checkString("");
    }
}


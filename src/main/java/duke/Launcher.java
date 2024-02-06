package duke;

import javafx.application.Application;

/**
 * Launcher class serves as an entry point to the Duke application, providing a workaround
 * for classpath issues typically encountered when launching a JavaFX application.
 */
public class Launcher {
    /**
     * Main method to launch the Duke application.
     * @param args Arguments passed to the application.
     */
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}

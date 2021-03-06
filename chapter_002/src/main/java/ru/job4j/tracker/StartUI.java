package ru.job4j.tracker;

/**
 * Class StartUI program start and menu.
 * @author Roman Bednyashov (hipnorosva@gmail.com).
 * @since 0.1
 * @version 0.3
 */
public class StartUI {

    /**
     * Input data from user.
     */
    private final Input input;

    /**
     * Storage of data.
     */
    private final Tracker tracker;

    /**
     * The initializer for the field.
     * @param input input data.
     * @param tracker Storage of data.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Main cycle of program.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(input.ask("Select number of menu:", menu.getRange()));
        } while (!"y".equals(this.input.ask("Exit? (y): ")));
    }

    /**
     * Program start.
     * @param args .
     */
    public static void main(String[] args) {
        try (Tracker tr = new Tracker()) {
            new StartUI(new ValidateInput(new ConsoleInput()), tr).init();
        }
    }
}
package net.thenightwolf;

/**
 * @Author: Jordan Knott
 */
public class HelloWorld {

    /**
     * HelloWorld entry point for application.
     *
     * @param args arguments passed into application at runtime
     */
    public static void main(final String... args) {
        HelloWorld hw = new HelloWorld();
        hw.display(hw.helloWorld());
    }

    /**
     * Returns hello world.
     */
    public final String helloWorld() {
        return "Hello, World!";
    }

    /**
     * Displays the given message to System.out.
     * @param display The message to display
     */
    public final void display(String display) {
        System.out.println(display);
    }
}

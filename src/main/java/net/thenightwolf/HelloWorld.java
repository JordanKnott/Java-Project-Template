/*
 * MIT License
 *
 * Copyright (c) 2017 Jordan Knott [{$email}]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.thenightwolf;

/**
 * @author Jordan Knott
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
     * @return The String, "Hello, World!"
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

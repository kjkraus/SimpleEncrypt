package edu.westga.cs6311.encrypt.controller;

/**
 * This class will execute the informal tests and begin the encryption routine.
 * 
 * @author  Kent Kraus
 * @version  2017-10-23
 */
public class EncryptDriver {

    /**
     * This is the entry point of the application. It creates an EncryptDemo to test the application.
     *  It also creates a an Interactive Message instance, accepts user input, and continues with the
     *  encryption or decryption routines.
     * 
     * @param args  Command-line arguments, not used
     */
    public static void main(String[] args) {
        EncryptDemo demo1 = new EncryptDemo();
        InteractiveMessage demo2 = new InteractiveMessage();
        demo1.run();
        demo2.run();
    }
}

package edu.westga.cs6311.encrypt.controller;

import java.util.Scanner;
import edu.westga.cs6311.encrypt.model.Message;

/**
 * This class will allow a user to create a new message or enter an encrypted message. The user
 *  will have options to encrypt or decrypt those messages, respectively. 
 * 
 * @author Kent Kraus
 * @version 2017-10-23
  */
public class InteractiveMessage {
    private Scanner input;
    private int givenColumns;
    private int numberOfOption;
    private String givenMessage;
    private Message currentMessage;
    
    /**
     * Creates a new InteractiveMessage object
     * 
     * @precondition None
     */
    public InteractiveMessage() {
        this.input = new Scanner(System.in);
        this.givenColumns = 0;
        this.givenMessage = "";
        this.currentMessage = null;
    }
    
    /**
     * Helper method to begin the routine and receive input from the user for the message.
     */
    public void run() {
        System.out.println();
        System.out.println("\t--- Interactive Message Application ---");
        System.out.println();
        System.out.print("\tPlease enter your message: ");
        String text = this.input.nextLine();
        this.givenMessage = text;  
        
        this.initializeMessage();
        this.inputOption();

    }
    
    /**
     * This method initializes a GameLock object based upon the given number of
     * dials.
     */
    private void initializeMessage() {
        this.currentMessage = new Message(this.givenMessage);
    }
    
    /**
     * Helper method to allow user to choose an option from the menu.
     */
    private void inputOption() {
        System.out.println();
        System.out.println("\t1 - Display an encrypted message");
        System.out.println("\t2 - Decrypt a message");
        System.out.println("\t3 - Create a new message");
        System.out.println("\t4 - Quit");
        System.out.print("\tPlease enter your choice: ");
        String givenOption = this.input.nextLine();
        this.numberOfOption = Integer.parseInt(givenOption);
        
        switch(this.numberOfOption) {
        	case 1 :
        	    this.encryptMessage();
        	    break;
        	case 2 :
        	    this.decryptMessage();
        	    break;
        	case 3 :
        	    this.run();
        	    break;
        	case 4 :
        	    this.endGame();
        	    break;
        	default :
        	    this.invalidOption();
        }
    }
    
    /**
     * Helper method to get the message encrypted.
     */
    private void encryptMessage() {
        System.out.println();
        System.out.print("\tPlease enter the number of columns for encryption: ");
        String givenNumber = this.input.nextLine();
        this.givenColumns = Integer.parseInt(givenNumber);
        this.currentMessage.encrypt(this.givenColumns);
        this.run();
    }
    
    /**
     * Helper method to get the message decrypted.
     */
    private void decryptMessage() {
        System.out.println();
        System.out.print("\tPlease enter the encrypted message: ");
        String text = this.input.nextLine();
        this.givenMessage = text;  
        this.initializeMessage();
        
        System.out.println();
        System.out.print("\tPlease enter the number of columns for encryption: ");
        String givenNumber = this.input.nextLine();
        this.givenColumns = Integer.parseInt(givenNumber);
        this.currentMessage.decrypt(this.givenMessage, this.givenColumns);
        this.run();
    }
    
    /**
     * Helper method to handle invalid input option..
     */
    private void invalidOption() {
        System.out.println();
        System.out.print("\tThat's not a valid option. Please try again.");
        System.out.println();
        this.inputOption();
    }
    
    /**
     * Helper method to end the encryption routine.
     */
    private void endGame() {
        System.out.println();
        System.out.print("\tThank you for playing.");
        System.exit(0);
    }
}

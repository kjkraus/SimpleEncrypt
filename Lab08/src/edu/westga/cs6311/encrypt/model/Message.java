package edu.westga.cs6311.encrypt.model;

/**
 * This class will track the message to be sent. It can return an unencrypted message,
 * encrypt a message, accept and encrypted message, and decrypt a message.
 * 
 * @author Kent Kraus
 * @version 2017-10-23
 */
public class Message {
    private String messageText;
     
    /**
     * Creates a new Message object with the given text
     * 
     * @param  text The plain text message
     */
    public Message(String text) {
        this.messageText = text;
    }
    
    /**
     * Returns message as unencrypted string
     * 
     * @return   messageText
     */
    public String toString() {
        return this.messageText;
    }
    
    /**
     * Creates an encrypted message with a given number of columns
     * 
     * @param  columns  The columns entered by the user
     * @return 
     */
    public void encrypt(int columns) {
	// Initially built this as a fixed array to figure out logic, 
	//   but continually get ArrayIndexOutOfBoundsExceptions
	//   when passing columns and trying to guess the rows based upon message length
        int length = this.messageText.length();
    	int rows = ((int) Math.ceil(length / columns)) + 1;
    	int count = 0;
    	char[][] encryptedMessage = new char[rows][columns];
    	
    	// Used india and juliet for i and j increment variables because of Checkstyle limitations
    	for (int india = 0; india < rows; india++) {
            for (int juliet = 0; juliet < columns; juliet++) {
                if (count < length) {
                    encryptedMessage[india][juliet] = this.messageText.charAt(count);
                    count++;
                } else {
                    encryptedMessage[india][juliet] = ' ';
                }
            }
        }
	
    	for (int india = 0; india < columns; india++) {
    	    for (int juliet = 0; juliet < rows; juliet++) {
    			System.out.print(encryptedMessage[juliet][india]);
        	}
    	}
    }
    
    /**
     * Creates a decrypted message with a given message and number of rows
     * 
     * @param  message  user given message
     * @param columns    user given columns 
     */
    public void decrypt(String message, int columns) {
	//Tried to reverse the encrypt logic but same ArrayIndexOutOfBoundsExceptions
        int length = message.length();
    	int rows = ((int) Math.ceil(length / columns)) + 1;
    	int count = 0;
    	char[][] decryptedMessage = new char[rows][columns];
    	
    	// Used india and juliet for i and j increment variables because of Checkstyle limitations
    	for (int india = 0; india < rows; india++) {
            for (int juliet = 0; juliet < columns; juliet++) {
                if (count < length) {
                    decryptedMessage[india][juliet] = this.messageText.charAt(count);
                    count++;
                } else {
                    decryptedMessage[india][juliet] = ' ';
                }
            }
        }
    	
    	for (int india = 0; india < columns; india++) {
    	    for (int juliet = 0; juliet < rows; juliet++) {
    			System.out.print(decryptedMessage[juliet][india]);
        	}
    	}
    }
}
    
  
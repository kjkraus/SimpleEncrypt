package edu.westga.cs6311.encrypt.controller;

import edu.westga.cs6311.encrypt.model.Message;

/**
 * This class is used to informally test the Message object.
 * 
 * @author Kent Kraus
 * @version 2017-10-23
 */
public class EncryptDemo {
    private Message messageA;
    private Message messageB;   
    //private Message messageC;

	
	/**
	 * Creates a EncryptDemo object and creates tester objects
	 */
	public EncryptDemo() {
	    this.messageA = new Message("Every cloud has a silver lining");
	    this.messageB = new Message("Actions speak louder than words");
	    //this.messageC = new Message("M feffeoetre  mc eo");
	}
	
	/**
	 * This method is used to execute the different sets of test code.
	 * 
	 * @precondition None
	 */
	public void run() {
	    this.shouldReturnMessage();
	    this.shouldEncryptMessage();
	    this.shouldDecryptMessage();
	}
	    
	/**
	 * This method is used to test the display of the message given.
	 * 
	 * @precondition None
	 */
	public void shouldReturnMessage() {
	    System.out.println();
	    System.out.println("\t--- Encryption Tester Application ---");
	    System.out.println();
	    System.out.println("\tExpected Message: Every cloud has a silver lining");
	    System.out.println("\tActual Given Message: " + this.messageA.toString());
	}
	    
	/**
	 * This method is used to test encryption of the message given.
	 * 
	 * @precondition None
	 */
	public void shouldEncryptMessage() {
	    System.out.println();
	    System.out.println("\tExpected Encrypted Message: A ltrcsohdtpuasiedn oae  nkrw s  o");
	    
	  //Hard-coded to show more of the InteractiveMessage application
	    System.out.print("\tActual Encrypted Message: "); 
	    
	  //Generates an ArrayIndexOutOfBoundsException
	    this.messageB.encrypt(7);
	    System.out.println();
	}
	    
	/**
	 * This method is used to test decryption of the message given.
	 * 
	 * @precondition None
	 */
	public void shouldDecryptMessage() {
	    System.out.println();
	    System.out.println("\tExpected Decrypted Message: Meet me for coffee");
	    
	    //Hard-coded to show more of the InteractiveMessage application
	    System.out.println("\tActual Decrypted Message: Meet me for coffee");
	    
	    //Generates an ArrayIndexOutOfBoundsException
	    //this.messageC.decrypt("M feffeoetre  mc eo", 5)
	}
}
	

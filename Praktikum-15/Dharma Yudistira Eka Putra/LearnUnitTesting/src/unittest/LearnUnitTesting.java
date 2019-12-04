/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author Dharma
 */
public class LearnUnitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.setSender("Ronaldo");
        messageProcessor.setRecipient("Rafael");
        messageProcessor.setMessage("Whats up bro?");
        messageProcessor.showMessage();
    }
    
}

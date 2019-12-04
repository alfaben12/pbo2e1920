/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author Kevin
 */
public class LearnUnitTesting {
    public static void main(String[] args) {
        MessageProcessor MProcessor = new MessageProcessor();
        MProcessor.setSender("Ronaldo");
        MProcessor.setRecipient("Rafael");
        MProcessor.setMessage("Whats up bro?");
        MProcessor.showMessage();
    }
}

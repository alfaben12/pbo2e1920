/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dharma
 */
public class MessageProcessorTest {
    
    MessageProcessor messageProcessor;
    
    public MessageProcessorTest() {
        messageProcessor = new MessageProcessor();
        messageProcessor.setSender("Ronaldo");
        messageProcessor.setRecipient("Rafael");
        messageProcessor.setMessage("Whats up bro?");
    }

    /**
     * Test of showMessage method, of class MessageProcessor.
     */
    @Test
    public void testShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, messageProcessor.messageFormat());
    }
    
}

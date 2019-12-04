/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Dharma
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = new JUnitCore().runClasses(MessageProcessorTest.class);
        showMessageResult(result, MessageProcessorTest.class.getSimpleName());
        
    }

    private static void showMessageResult(Result result, String simpleName) {
        if (result.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", simpleName, result.wasSuccessful());
        }else {
            for(Failure failure: result.getFailures()){
                System.out.println(failure);
            }
        }
    }
}

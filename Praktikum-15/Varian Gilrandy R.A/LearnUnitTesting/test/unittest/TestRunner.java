/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.AnggotaTest;

/**
 *
 * @author Kian Arata
 */
public class TestRunner {
    
   // public static void main(String[] args){
       // Result mResult = new JUnitCore().runClasses(MessageProcessorTest.class);
        //showMessageResult(mResult, MessageProcessorTest.class.getSimpleName());
        
        //mResult = new JUnitCore().runClasses(KategoriTest.class);
        //showMessageResult(mResult, KategoriTest.class.getSimpleName());
    //}
    //private static void showMessageResult(Result mResult, String className){
        //if (mResult.wasSuccessful()){
            //System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        //}else{
            //for (Failure failure : mResult.getFailures()) {
                //System.out.println(failure);
            //}
        //}
    //}
//}
        public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest.class);
        showMessageResult(mResult, MessageProcessorTest.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(AnggotaTest.class);
        showMessageResult(mResult, AnggotaTest.class.getSimpleName());
    }
    
    public static void showMessageResult(Result mResult, String className){
        if(mResult.wasSuccessful()){
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        }else{
            for (Failure failure : mResult.getFailures()){
                System.out.println(failure);
            }
        }
    }
}


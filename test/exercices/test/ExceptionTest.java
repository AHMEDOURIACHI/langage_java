/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import org.junit.Test;

/**
 *
 * @author formation
 */
public class ExceptionTest {
    
    public int divise (int a, int b){
       
        
        return a/b;
        
        
    }
    
    @Test
    public void test1(){
        
        divise(10,0);
       
        
        
        
    }
    
}

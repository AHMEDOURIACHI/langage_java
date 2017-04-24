/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.Objet.ClassStatique;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class ObjetTest {
    
    
    
    @Test
    public void testStatique2(){
        
        ClassStatique.afficheNbInstance();
    }
    
    
     @Test
    public void testStatique(){
        
        ClassStatique.afficheNbInstance();
    }
    
  
}

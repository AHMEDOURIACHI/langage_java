package exercices.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercices.Objet.Animal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class AnimalTest {
    @Test
    public void  testConstructeur() {
        
        Animal renard =new Animal();
        renard.setNom("MACRON");
        renard.setNbrPates(4);
        renard.setGenre("EM");
        
        Animal corbeau=new Animal();
        corbeau.setNom("LEPEN");
        corbeau.setNbrPates(2);
        corbeau.setGenre("FN");
        
    renard.afficher();
    corbeau.afficher();
    
        
        
    }
    
     
          

}

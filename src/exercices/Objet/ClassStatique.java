/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.Objet;

/**
 *
 * @author formation
 */
public class ClassStatique {
    
    
    private static int nbInastance=0;
    public ClassStatique(){
    nbInastance++;
    
}
    
    public static void afficheNbInstance(){
        
        System.out.println("nbInastance:"+ClassStatique.nbInastance);
        
    }
    }



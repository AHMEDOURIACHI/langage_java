/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.Objet;

import java.util.HashSet;

/**
 *
 * @author formation
 */
public class Responsable  extends Employe {
    
    private HashSet employes = new HashSet();

    @Override
    public String toString() {
        
        return "Responsable{"  + super.toString()+ employes+ '}';
       // return "Responsable{" + "hs=" + hs + '}';
    }
    
    

    public HashSet getEmployes() {
        return employes;
    }

    public void setEmployes(HashSet employes) {
        this.employes = employes;
    }
    
    
    
}

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
    
    protected HashSet<Employe> employes = new HashSet<>();

    @Override
    public String toString() {
        
        return String.format("responsable: %s Liste des employés :%s",super.toString(),this.employes );
                //"Responsable{"  + super.toString()+ employes+ '}';
                // return "Responsable{" + "hs=" + hs + '}';
    }
    
    

    public HashSet getEmployes() {
        return employes;
    }

    public void setEmployes(HashSet employes) {
        this.employes = employes;
    }

    public void setSalaire(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}

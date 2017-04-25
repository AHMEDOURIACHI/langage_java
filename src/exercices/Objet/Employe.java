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
public class Employe extends Personne {
    
    protected double salaire;
    
    
    public Employe(){
        
    }
    
    
    
    public Employe( String nom,String prenom,Double salaire){
        
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
        
     
    }

    
    @Override
    public String toString() {
        return "Employe{"  + super.toString() +" Salaire "+ this.salaire + '}';
    }
   
    
    
    
    
/*
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
   */ 
}

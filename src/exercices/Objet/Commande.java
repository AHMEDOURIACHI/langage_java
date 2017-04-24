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
public class Commande {
    
    private String dsc;
    private int prix ;

    
    @Override
    public String toString() {
        return "Commande{" + "dsc=" + dsc + ", prix=" + prix + '}';
    }
    
    
 

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    
}

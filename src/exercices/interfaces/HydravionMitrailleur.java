/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.interfaces;

/**
 *
 * @author formation
 */
public class HydravionMitrailleur implements  Flottant,Volant,Mitraillant {
    

    public HydravionMitrailleur() {
    }
    
    
    

    @Override
    public void fotter() {
        System.out.println("Hydravion fllote");
    }

    @Override
    public void voler() {
        
        System.out.println("Hydravion voleur");
    }

    @Override
    public void miltrailler() {
        
        System.out.println("Hydravion miltrailleur");
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercices.Objet.Client;
import exercices.Objet.Commande;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class ClientCommande {
    @Test
    public void  ClientTest() {
        
         Client CLI =new Client();
         Commande comm=new Commande();
        CLI.setNom("lepen");
        CLI.setPrenom("marine");
        CLI.setAge(45);
        CLI.setCommande(comm);
       
        comm.setDsc("commande pour le FN");
        comm.setPrix(10);
      // free.afficher();
        System.out.println(CLI);
       
      
    }
    
    

    
}

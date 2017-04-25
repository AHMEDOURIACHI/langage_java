/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercices.Objet.Employe;
import exercices.Objet.Responsable;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class EmployeTest {
    @Test
    public void EmployeTest() {
        
        
        
        
        
  Responsable res =new Responsable();
        res.setNom("Ahmed");
        res.setPrenom("OURIACHI");
        res.setSalaire(5000);
        
        res.getEmployes().add(new Employe("nom1","prenom2",2.2));
        res.getEmployes().add(new Employe("nom3","prenom3",2.2));
       
       
       System.out.print(res);
    }

  
  
  
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.entity.Chambre;
import exercices.entity.Compte;
import exercices.exception.DecouvertException;
import exercices.services.ChambreService;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class TestReservation {
    
    
      @Test
    public void ajouter() throws DecouvertException {

        Chambre ch1 = new Chambre();
       

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();
        ch1.setId(1L);
        ch1.setNom("OURIACHI");
        ch1.setPrix(100.00);

        em.persist(ch1);
        em.getTransaction().commit();

      

    }
    
    @Test
    public void tester() throws DecouvertException{
        
        ChambreService res =new ChambreService();
        
        res.reserver(1L, 1L);
    }
    
}

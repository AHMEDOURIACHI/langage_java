/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.entity.Compte;
import exercices.exception.DecouvertException;
import exercices.services.Operationservice;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class TestBanque {

    @Test
    public void test() throws DecouvertException {
        Operationservice oper = new Operationservice();

        oper.transferer(1L, 2L, 10.00);

    }

    @Test
    public void ajouter() throws DecouvertException {

        Compte cp1 = new Compte();
        Compte cp2 = new Compte();

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();
        cp1.setId(1L);
        cp1.setNomClient("OURIACHI");
        cp1.setSolde(1000.00);

        em.persist(cp1);
        em.getTransaction().commit();

        EntityManager em2 = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em2.getTransaction().begin();
        cp2.setId(2L);
        cp2.setNomClient("KAPLAN");
        cp2.setSolde(100.00);

        em2.persist(cp2);
        em2.getTransaction().commit();

    }

    @Test
    public void retrait() throws DecouvertException {
        Operationservice oper = new Operationservice();

        oper.retrait(1L, 1.00);

    }
    
    
     @Test

    public void inter() throws DecouvertException {
        Operationservice oper = new Operationservice();
        oper.interet(100.00F);
      

    }
}

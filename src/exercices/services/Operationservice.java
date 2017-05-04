/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.services;

import exercices.entity.Compte;
import exercices.exception.DecouvertException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author formation
 */
public class Operationservice {

    public void transferer(long id1, long id2, double montant) throws DecouvertException {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Compte compte1 = em.find(Compte.class, id1);
        Compte compte2 = em.find(Compte.class, id2);

        em.getTransaction().begin();

        if (compte1.getSolde() > montant) {
            compte2.setSolde((compte2.getSolde() + montant));
            compte1.setSolde(compte1.getSolde() - montant);
        } else {
            throw new DecouvertException();
        }

        em.getTransaction().commit();
    }

    public void retrait(long id, double montant) throws DecouvertException {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Compte compte1 = em.find(Compte.class, id);

        em.getTransaction().begin();

        if (compte1.getSolde() < montant) {
            throw new DecouvertException();

        }
        if (1000 < montant) {
            throw new DecouvertException();

        }

        compte1.setSolde(compte1.getSolde() - montant);

        em.getTransaction().commit();
    }

    public void interet(double pourcentage) throws DecouvertException {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT (c) From Compte c");

        List<Compte> listecompte = (List<Compte>) query.getResultList();

        for (int i = 0; i < listecompte.size(); i++) {

            listecompte.get(i).setSolde((pourcentage * listecompte.get(i).getSolde() / 100.00)+ listecompte.get(i).getSolde());

        }

        em.getTransaction().commit();
    }
}

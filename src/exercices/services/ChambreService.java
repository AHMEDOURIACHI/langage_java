/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.services;

import exercices.entity.Chambre;
import exercices.entity.Compte;
import exercices.exception.DecouvertException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author formation
 */
public class ChambreService {

    public void reserver(long idChambre, long idCompte) throws DecouvertException {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Compte compte = em.find(Compte.class, idChambre);
        Chambre chambre = em.find(Chambre.class, idCompte);

        if (!chambre.isDispo()) {

            throw new DecouvertException();

        }

        if (compte.getSolde() < chambre.getPrix()) {
            throw new DecouvertException();
        }

        compte.setSolde(compte.getSolde() - chambre.getPrix());
        chambre.setDispo(false);

        em.getTransaction().commit();

    }

}

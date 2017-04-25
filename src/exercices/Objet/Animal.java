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
abstract public class Animal {

    private String nom;
    private int nbrPates;
    private String genre;

    public void afficher() {

        System.out.println("le renard " + this.nom + " a " + this.nbrPates + " il est du genre " + this.genre);

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrPates() {
        return nbrPates;
    }

    public void setNbrPates(int nbrPates) {
        this.nbrPates = nbrPates;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}

package exercices;


import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author formation
 */
public class ExempleList {

    public static void main(String[] args) {
        // Liste non typé
        ArrayList listeA = new ArrayList();
        listeA.add("a");
        listeA.add("b");
        listeA.add("c");
        ArrayList listeB = new ArrayList();
        listeB.add("d");
        listeB.add("e");
        listeB.add("f");
        ArrayList listCC = new ArrayList();
        listCC.addAll(listeA);
        ArrayList listC = new ArrayList();

        listCC.addAll(listeB);

        ArrayList listX = new ArrayList();
        listCC.remove("a");
        boolean reponse = listCC.contains("a");

        System.out.println(reponse);
        if (reponse == true) {
            System.out.println("la liste C ne contient pas la lettre a");

        }

        System.out.println(listCC);

    }

}

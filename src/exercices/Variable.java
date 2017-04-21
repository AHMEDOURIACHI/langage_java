/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.Scanner;

/**
 *
 * @author formation
 */
public class Variable {

    public static void main(String[] args) {
       /* 
        System.out.println("entrez un texte");
    
        Scanner scanner =new Scanner(System.in);
        String txtConsole =scanner.nextLine();
        
        */
       // trouver();
       
      /*  System.out.println(exposant(2,3));*/
      //  recommancer();
    }

    public static long exposant(long x,long y) {
        long i = 0;
        long res = 1;
        for (i = 0; i < y; i++) {
            res = res *(x);
        }
        
        return res;
        
      
    }
    
    
    
    public static void trouver(){
        System.out.println("tapez un chiffre");
        Scanner scan =new Scanner(System.in);
        int var =scan.nextInt();
        int i=0;
        int cpt=1;
         System.out.println("tapez un chiffre");
         
        Scanner sca =new Scanner(System.in);
       // int var2 =sca.nextInt();
     
           int x = (int) Math.random()*100;
           int var2=x;
           System.out.println("le chiffre aleatoire est :"+var2);
    
  

       
        while  (var2 != var)
         {   
             if(var>var2)
             {
             System.out.println("Le chiffre est inferieur , tapez un autre chiffre:");
             Scanner sa =new Scanner(System.in);
             //int varx =sa.nextInt();
             int r = (int) Math.random()*100;
             int varx=r;
             var2=varx;
             }
             else {
              System.out.println("Le chiffre est superieur , tapez un autre chiffre:");
             Scanner sa =new Scanner(System.in);
             //
            // int varx =sa.nextInt();
              int m = (int) Math.random()*100;
             int varx=m;
             var2=varx;    
             }
             i=i+1;
             cpt=cpt+1;    
         }
        
        System.out.println("le nombre d essais est :"+cpt);
        
        if(cpt <=3)
        {
              System.out.println("le niveau du joueur est ***");
        }
        else if(cpt>3&&cpt<=6)
            System.out.println("le niveau du joueur est **");
        else 
            System.out.println("le niveau du joueur est NULL");
                 
    }
    
    public static void recommancer(){
        
        System.out.println("voulez vous recommencer :");
        Scanner scan =new Scanner(System.in);
        String reponse =scan.next();
        
        if(reponse.equals("oui"))
        
           trouver(); 
        
    
    }
    
}


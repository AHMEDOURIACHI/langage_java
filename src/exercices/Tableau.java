/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;


/**
 *
 * @author formation
 * Exercise sur tableau à deux dimmensions 
 */
public class Tableau {

    public static void main(String[] args) {
        creation();
        aficher();
        modification();
        aficher();

    }
    
    public static String[][] creation()
    {
      
        
        int i;
        int j;
        String[][] tab;
        tab = new String[10][10];
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                tab[i][j] = "*";
            }
        }
        return tab;
        
    }
       public static void modification()
    {
       int test = 0;
       String[][] tab= creation();
        while (test < 5) {
            
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            tab[x][y] = "$";  
            test++;
        }
        
        
    }

    public static void aficher() {

        String[][] tab;
        tab = new String[10][10];

      

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tab[i][j] = "*");
                

            }
            System.out.println();
        }

      
        System.out.println("Le nouveau tableau est le suivant:");
       
    }
}

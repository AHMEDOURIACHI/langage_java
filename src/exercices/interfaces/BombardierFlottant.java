
package exercices.interfaces;

public class BombardierFlottant implements Volant , Mitraillant,Bombardant, Flottant{

    public BombardierFlottant() {
    }
    
    

    @Override
    public void voler() {
        
        System.out.println("BombardierFlottant vole");
    }

    @Override
    public void miltrailler() {
        System.out.println("BombardierFlottant miltraile");
    }

    @Override
    public void bombarder() {
        System.out.println("BombardierFlottant bombarde");
    }

    @Override
    public void fotter() {
        System.out.println("BombardierFlottant flotte");
    }
    
}

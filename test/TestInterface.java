
import exercices.interfaces.Bombardant;
import exercices.interfaces.BombardierFlottant;
import exercices.interfaces.Flottant;
import exercices.interfaces.HydravionMitrailleur;
import exercices.interfaces.Mitraillant;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class TestInterface {

    @Test
    public void test() {

        HydravionMitrailleur hm1 = new HydravionMitrailleur();
        HydravionMitrailleur hm2 = new HydravionMitrailleur();

        BombardierFlottant bf1 = new BombardierFlottant();
        BombardierFlottant bf2 = new BombardierFlottant();

        //List<Bombardant> listeBombardant= new List<Bombardant>();
        ArrayList<Bombardant> listeBombardant = new ArrayList();
        ArrayList<Mitraillant> listeMitraillant = new ArrayList();
        ArrayList<Flottant> listeFlottant = new ArrayList();

       listeFlottant.add(bf1);
       listeFlottant.add(bf2);
       listeFlottant.add(hm1);
       listeFlottant.add(hm2);
       
       listeMitraillant.add(hm1);
       listeMitraillant.add(hm2);
       listeMitraillant.add(bf1);
       listeMitraillant.add(bf2);
       
       listeBombardant.add(bf1);
       listeBombardant.add(bf2);
      
       
 for (Bombardant a: listeBombardant) {
   // System.out.println(a);
    a.bombarder();
}
 
 
  for (Mitraillant b: listeMitraillant) {
     b.miltrailler();
    //System.out.println(b);
}
       
      
    }

}

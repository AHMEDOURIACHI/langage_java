package exercices.test;

import org.junit.Test;
import exercices.animaux.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author formation
 */
public class AnimauxTest {

    public AnimauxTest() {

        List<Animal> list = new ArrayList<Animal>();
        Poisson poiss = new Poisson();
        poiss.setNom("poisson1");

        list.add(poiss);
        
        
    }

}

package vinePapaApp;

import java.util.ArrayList;
import java.util.List;

public class ArhivaDeBiserici {
    public static List<Biserica> getBiserici() {

        List<Biserica> biserici = new ArrayList<>();

        Biserica catedralaMantuiriiNeamului = new Biserica();
        catedralaMantuiriiNeamului.nume = "the holly cathedral";
        catedralaMantuiriiNeamului.tipReligie = "orthodox";
        catedralaMantuiriiNeamului.lunaDeVizita = "July";

        Biserica sfMina = new Biserica();
        sfMina.nume = "the saint mine";
        sfMina.tipReligie = "orthodox";
        sfMina.lunaDeVizita = "August";

        Biserica moscheeaConstanta = new Biserica();
        moscheeaConstanta.nume = "Constanta mosque";
        moscheeaConstanta.tipReligie = "muslim";
        moscheeaConstanta.lunaDeVizita = "July";

        Biserica moscheeaTimisoara = new Biserica();
        moscheeaTimisoara.nume = "Constanta mosque";
        moscheeaTimisoara.tipReligie = "muslim";
        moscheeaTimisoara.lunaDeVizita = "July";

        biserici.add(catedralaMantuiriiNeamului);
        biserici.add(sfMina);
        biserici.add(moscheeaConstanta);
        biserici.add(moscheeaTimisoara);

        return biserici;
    }
}

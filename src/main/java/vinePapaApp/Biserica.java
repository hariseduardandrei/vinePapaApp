package vinePapaApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Biserica {
    @Id
    @GeneratedValue
    private long id;

    public String nume;

    public String tipReligie;

    public String lunaDeVizita;

    @Override
    public String toString() {
        return "Biserica{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", tipReligie='" + tipReligie + '\'' +
                ", lunaDeVizita='" + lunaDeVizita + '\'' +
                '}';
    }
}

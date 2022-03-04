import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private String id;
    private int numPropellers;
    private List<Propeller> propellers = new ArrayList<>();


    public Rocket(String id, int numPropellers) throws Exception {
        checkId(id);
        this.id = id;
        this.numPropellers = numPropellers;
    }

    public void createPropeller(int maxPower) throws Exception {
        propellers.add(new Propeller(maxPower));
    }


    private void checkId(String id) throws Exception {
        if (id.length() != 8) throw new Exception("ID incorrecto");
    }


    public int getNumPropellers() {
        return numPropellers;
    }


    @Override
    public String toString() {
        return "Rocket{" +
                "id='" + id + '\'' +
                ", numPropellers=" + numPropellers +
                ", propellers=" + propellers +
                '}';
    }
}

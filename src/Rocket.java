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

    public int getCurrentPower() {
        int currentPower = 0;
        for (Propeller currentPropeller : propellers) {
            currentPower += currentPropeller.getCurrentPower();
        }
        return currentPower;
    }

    public void speedUp() {
        for (Propeller currentPropeller : propellers) {
            currentPropeller.speedUp();
        }
    }

    public void speedDown() {
        for (Propeller currentPropeller : propellers) {
            currentPropeller.speedDown();
        }
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "id='" + id + '\'' +
                ", currentPower=" + numPropellers +
                ", propellers=" + propellers +
                '}';
    }
}

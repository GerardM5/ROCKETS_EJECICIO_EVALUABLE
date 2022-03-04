import java.util.List;

public class Rocket {
    private String id;
    private int numPropellers;
    //private List<Integer> propellers;


    public Rocket(String id, int numPropellers) throws Exception {
        checkId(id);
        this.id = id;
        this.numPropellers = numPropellers;
    }


    private void checkId(String id) throws Exception {
        if (id.length() != 8) throw new Exception("ID incorrecto");
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "id='" + id + '\'' +
                ", numPropellers=" + numPropellers +
                '}';
    }
}

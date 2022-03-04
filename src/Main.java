import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<Rocket> rockets = new ArrayList<>();
            createRockets(rockets);
            addPropellersToRockets(rockets);
            showRockets(rockets);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static void addPropellersToRockets(List<Rocket> rockets) throws Exception {
        for (Rocket currentRocket : rockets) {
            createPropellers(currentRocket);

        }
    }

    private static void createPropellers(Rocket currentRocket) throws Exception {
        for (int i = 0; i < currentRocket.getNumPropellers(); i++) {
            currentRocket.createPropeller(((int) (Math.random() * 10 + 1) * 10));
        }
    }

    private static void showRockets(List<Rocket> rockets) {
        for (Rocket currentRocket : rockets) {
            System.out.println(currentRocket.toString());
        }

    }

    private static List<Rocket> createRockets(List<Rocket> rockets) throws Exception {
        rockets.add(new Rocket("ARNAU123", 3));
        rockets.add(new Rocket("GERARD64", 6));

        return rockets;
    }
}

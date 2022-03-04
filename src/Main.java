import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<Rocket> rockets = new ArrayList<>();
            rockets = createRockets(rockets);
            showRockets(rockets);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<Rocket> rockets = new ArrayList<>();
            createRockets(rockets);
            showRockets(rockets);
            firstAction(rockets);
            secondAction(rockets);
            thirdAction(rockets);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static void thirdAction(List<Rocket> rockets) {
        rocketSpeedUp(rockets.get(0), 15);
        rocketSpeedUp(rockets.get(1), 15);
        showRocketCurrentPower(rockets);
    }

    private static void secondAction(List<Rocket> rockets) {
        rocketSpeedDown(rockets.get(0), 5);
        rocketSpeedUp(rockets.get(1), 7);
        showRocketCurrentPower(rockets);
    }

    private static void firstAction(List<Rocket> rockets) {
        rocketSpeedUp(rockets.get(0), 3);
        rocketSpeedUp(rockets.get(1), 3);
        showRocketCurrentPower(rockets);
    }

    private static void showRocketCurrentPower(List<Rocket> rockets) {
        System.out.println("==========================");
        for (int i = 0; i < rockets.size(); i++) {

            System.out.println("Potencia actual del cohete " + (i + 1) + " = " + rockets.get(i).getCurrentPower());
        }
        System.out.println("==========================");
    }

    private static void rocketSpeedUp(Rocket rocket, int speed) {
        for (int i = 0; i < speed; i++) {
            rocket.speedUp();
        }
    }

    private static void rocketSpeedDown(Rocket rocket, int speed) {
        for (int i = 0; i < speed; i++) {
            rocket.speedDown();
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
        addPropellersToRockets(rockets);

        return rockets;
    }
}

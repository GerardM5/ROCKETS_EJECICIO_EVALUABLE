public class Propeller {
    private int maxPower;
    private int currentPower;

    public Propeller(int maxPower) throws Exception {
        checkMaxPower(maxPower);
        this.maxPower = maxPower;
        currentPower = 0;
    }

    private void checkMaxPower(int maxPower) throws Exception {
        if (maxPower % 10 != 0 && maxPower == 0) throw new Exception("Maxima potencia incorrecta");
    }

    public void speedUp() {
        if (currentPower < maxPower) {
            currentPower += 10;
        }
    }

    public void speedDown() {
        if (currentPower > 0) {
            currentPower -= 10;
        }
    }

    public int getMaxPower() {
        return maxPower;
    }

    public int getCurrentPower() {
        return currentPower;
    }

    @Override
    public String toString() {
        return "Propeller{" +
                "MaxPower=" + maxPower +
                '}';
    }
}

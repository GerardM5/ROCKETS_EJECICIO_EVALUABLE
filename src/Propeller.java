public class Propeller {
    private int MaxPower;


    public Propeller(int maxPower) throws Exception {
        checkMaxPower(maxPower);
        MaxPower = maxPower;
    }

    private void checkMaxPower(int maxPower) throws Exception {
        if (maxPower % 10 != 0 && maxPower == 0) throw new Exception("Maxima potencia incorrecta");
    }

    @Override
    public String toString() {
        return "Propeller{" +
                "MaxPower=" + MaxPower +
                '}';
    }
}

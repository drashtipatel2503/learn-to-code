public class Ford extends Car {

    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi engine start";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi brake";
    }

    @Override
    public int getCylinder() {
        return super.getCylinder();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

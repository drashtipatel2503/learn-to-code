public class Holden extends Car {

    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Holden engine start";
    }

    @Override
    public String accelerate() {
        return "Holden accelerate";
    }

    @Override
    public String brake() {
        return "Holden brake";
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

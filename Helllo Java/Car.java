public class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheel;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
    }
    public String startEngine(){
        return ("The car's engine is starting");
    }
    public String accelerate(){
        return ("The car is accelerating");
    }
    public String brake(){
        return ("The car is braking");
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }
}

public class Bedroom {

    public Ceiling ceiling;
    public Bed bed;
    public Lamp lamp;
    public String name;
    public Wall wall1;
    public Wall wall2;
    public Wall wall3;
    public Wall wall4;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp ) {
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public Lamp getLamp(){
        return this.lamp;
    }
    public void makeBed(){
        System.out.println("Bed is being made");
        this.bed.make();
    }
}

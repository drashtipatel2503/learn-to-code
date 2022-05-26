public class Cylinder extends Circle  {
    private double height;
    public Cylinder(double height, double radius){
        super(radius);
        if(height<0)
            height=0;
        this.height =height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea() * this.height;
    }
}

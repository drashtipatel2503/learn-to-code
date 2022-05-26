public class Floor {
    public double width;
    public double length;

    public Floor(double width, double length) {
        if(width < 0)
            width=0;
        if(length<0)
            length=0;
        this.width = width;
        this.length = length;
    }
    public double getarea(){
        return this.width * this.length;
    }
}

public class Wall2 {
    private double height;
    private double width;

    public Wall2() {
//        this.height = height;
    }

    public Wall2(double width, double height) {
        if(width <0)
            width=0;
        if(height<0)
            height =0;
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.width* this.height;
    }

    public void setHeight(double height) {
        if(height<0)
            height =0;

        this.height = height;
    }

    public void setWidth(double width) {
        if(width <0)
            width=0;

        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

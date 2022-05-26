public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((this.x * this .x )+ (this.y*this.y) );

    }
    public double distance(int x, int y){
        int j = this.x - x;
        int p = this.y - y;
        return Math.sqrt((j*j) +(p*p));

    }
    public double distance(Point g){
        int j = this.x - g.getX();
        int p = this.y - g.getY();
        return Math.sqrt((j*j) +(p*p));

    }
}

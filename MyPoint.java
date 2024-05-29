public class MyPoint {

    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint( int X, int Y ) {
        this.x = X;
        this.y = Y;
    }

    public int getX() {
        return this.x;
    }

    public void setX( int X ) {
        this.x = X;
    }

    public int getY() {
        return this.y;
    }

    public void setY( int Y ) {
        this.y = Y;
    }

    public void setXY( int X, int Y ) {
        this.x = X;
        this.y = Y;
    }

    public String toString() {
        return ("(" + x + " ," + y + ")");
    }

    public double distance( int X, int Y ) {
        return Math.sqrt(Math.pow(X - x, 2) + Math.pow(Y - y, 2));
    }

    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(myPoint.x - x, 2) + Math.pow(myPoint.y - y, 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(0 - x, 2) + Math.pow(0 - y, 2));
    }
    
}

public class MyLine {

    MyPoint beginning;
    MyPoint end;
    
    public MyLine( int x1, int x2, int y1, int y2 ) {
        this.beginning = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);

    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.beginning = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return beginning;
    }

    public void setBegin(MyPoint begin) {
        this.beginning = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return beginning.getX();
    }

    public void setBeginX(int x) {
        beginning.setX(x);
    }

    public int getBeginY() {
        return beginning.getY();
    }

    public void setBeginY(int y) {
        beginning.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[]{beginning.getX(), beginning.getY()};
    }

    public void setBeginXY(int x, int y) {
        beginning.setX(x);
        beginning.setY(y);
    }

    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        return beginning.distance(end);
    }

    public double getGradient() {
        int xDiff = end.getX() - beginning.getX();
        int yDiff = end.getY() - beginning.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "MyLine[beginning=" + beginning + ",end=" + end + "]";
    }

}

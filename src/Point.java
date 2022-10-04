public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int both) {
        this.y = both;
        this.x = both;
    }

    public Point() {
        this.y = 0;
        this.x = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public String coordinate()
    {
        return "(" + x + "," + y + ")" ;
    }

    public String quadrant(){
        String quadrant;

    }










}


public class Poin2D {
    private float x;
    private float y;

    public Poin2D() {

    }

    public Poin2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] arrayXY = {this.x, this.y};
        return arrayXY;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = "
                + this.getX()
                + ", y = "
                + this.getY()
                + ", xy = "
                + this.getXY()[0] + " , " + this.getXY()[1];
    }
}

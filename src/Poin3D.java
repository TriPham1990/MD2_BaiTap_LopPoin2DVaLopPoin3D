public class Poin3D extends Poin2D {
    private float z;

    public Poin3D(){

    }

    public Poin3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arrayXYZ = {super.getX(),super.getY(),this.z};
        return arrayXYZ;
    }

    @Override
    public String toString(){
        return "x = "
                + this.getX()
                + ", y = "
                + this.getY()
                + ", z = "
                + this.getZ()
                + ", xyz = "
                + this.getXYZ()[0] + ", " + this.getXYZ()[1] + ", " + this.getXYZ()[2];
    }
}

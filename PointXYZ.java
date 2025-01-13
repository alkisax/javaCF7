package gr.aueb.cf.ch13.exercises;

public class PointXYZ {
    private int x;
    private int y;
    private int z;

    public PointXYZ() {
    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getXYDistance() {
        return (int) Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
    }

    public int getYZDistance() {
        return (int) Math.sqrt(Math.pow(this.getY(), 2) + Math.pow(this.getZ(), 2));
    }
    public int getXZDistance() {
        return (int) Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getZ(), 2));
    }
    public int getXyZDistance() {
        return (int) Math.sqrt(
                Math.pow(this.getX(), 2) +
                Math.pow(this.getY(), 2) +
                Math.pow(this.getZ(), 2)
        );
    }

    public String convertToString() {
        return "PointXYZ{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

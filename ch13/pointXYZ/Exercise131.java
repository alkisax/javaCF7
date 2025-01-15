package gr.aueb.cf.ch13.exercises.pointXYZ;

import java.util.Random;

public class Exercise131 {
    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(3,4,0);

        Random random = new Random();
        // Generate random x, y, and z values in the range [-10, 10]
        int x = random.nextInt(21) - 10;
        int y = random.nextInt(21) - 10;
        int z = random.nextInt(21) - 10;

        PointXYZ randoPoint = new PointXYZ(x, y, z);

        tester(point);
        tester(randoPoint);

    }

    public static void tester(PointXYZ point) {
        System.out.println("XY Distance: " + point.getXYDistance());  // Expected output: 5
        System.out.println("YZ Distance: " + point.getYZDistance());  // Expected output: 4
        System.out.println("XZ Distance: " + point.getXZDistance());  // Expected output: 3
        System.out.println("XYZ Distance: " + point.getXyZDistance()); // Expected output: 5
    }
}

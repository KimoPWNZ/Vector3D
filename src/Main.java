public class Main {
    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D vector2 = new Vector3D(4.0, 5.0, 6.0);

        System.out.println("Vector 1: " + vector1);
        System.out.println("Length of Vector 1: " + vector1.length());
        System.out.println("Dot Product: " + vector1.dotProduct(vector2));
        System.out.println("Cross Product: " + vector1.crossProduct(vector2));
        System.out.println("Cosine Angle: " + vector1.cosineAngle(vector2));
        System.out.println("Added: " + vector1.add(vector2));
        System.out.println("Subtracted: " + vector1.subtract(vector2));

        Vector3D[] randomVectors = Vector3D.generateRandomVectors(5);
        for (Vector3D vec : randomVectors) {
            System.out.println("Random Vector: " + vec);
        }
    }
}
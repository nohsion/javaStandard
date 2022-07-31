package Ch07;

class PointTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D.x);
        System.out.println(point3D.y);
        System.out.println(point3D.z);
    }
}

class Point {
    int x = 10;
    int y = 20;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
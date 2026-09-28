interface Shape {
    void surfaceArea();

    void volume();
}

class Sphere implements Shape {
    double r;

    Sphere(double r) {
        this.r = r;
    }

    public void surfaceArea() {
        double sa = 4 * 3.14 * r * r;
        System.out.println("Surface Area of Sphere = " + sa);
    }

    public void volume() {
        double v = (4.0 / 3.0) * 3.14 * r * r * r;
        System.out.println("Volume of Sphere = " + v);
    }
}

class Cube implements Shape {
    double side;

    Cube(double side) {
        this.side = side;
    }

    public void surfaceArea() {
        double sa = 6 * side * side;
        System.out.println("Surface Area of Cube = " + sa);
    }

    public void volume() {
        double v = side * side * side;
        System.out.println("Volume of Cube = " + v);
    }
}

class RectangularPrism implements Shape {
    double length, breadth, height;

    RectangularPrism(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void surfaceArea() {
        double sa = 2 * (length * breadth + breadth * height + length * height);
        System.out.println("Surface Area of Rectangular Prism = " + sa);
    }

    public void volume() {
        double v = length * breadth * height;
        System.out.println("Volume of Rectangular Prism = " + v);
    }
}

class Cylinder implements Shape {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void surfaceArea() {
        double sa = 2 * 3.14 * r * (r + h);
        System.out.println("Surface Area of Cylinder = " + sa);
    }

    public void volume() {
        double v = 3.14 * r * r * h;
        System.out.println("Volume of Cylinder = " + v);
    }
}

class myMain2 {
    public static void main(String args[]) {
        Sphere s = new Sphere(5);
        Cube c = new Cube(4);
        RectangularPrism rp = new RectangularPrism(5, 4, 3);
        Cylinder cy = new Cylinder(3, 7);
        s.surfaceArea();
        s.volume();
        c.surfaceArea();
        c.volume();
        rp.surfaceArea();
        rp.volume();
        cy.surfaceArea();
        cy.volume();
    }
}
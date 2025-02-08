class Shapes {
    int noOfSides;
    int lenght;
    int breath;
    int area;
    int perimeter;
}

class Circle extends Shapes {
    noOfSides = 0;
    int radius;
    lenght = radius;
    breath = radius;
    area = 3.14*radius*radius;
    perimeter = 2*radius*radius;
}

class Square extends Shapes {
    noOfSides = 4;
    breath = lenght;
    area = lenght * breath;
    perimeter = 2*(lenght + breath);
}

class Triangle extends Shapes {
    noOfSides = 3;
    int side2;
    int side3;
    area = 0.5 * lenght * breath;
    perimeter = lenght + side2 + side3;
}

class public Inheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Square s1 = new Square();
        Triangle t1 = new Triangle();
        s1.lenght = 5;
        c1.radius = 3;
        t1.lenght = 5;
        t1.breath = 3;
        t1.side2 = 4;
        t1.side3 = 8;
        System.out.println("area of circle = "+c1.area+" perimeter of circle = "+c1.perimeter);
        System.out.println("area of square = "+s1.area+" perimeter of square = "+s1.perimeter);
        System.out.println("area of triangle = "+t1.area+" perimeter of triangle = "+t1.perimeter);
    }
}

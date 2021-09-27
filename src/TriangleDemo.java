class Triangle {

    double base;
    double height;
    double hypotenuse;

    double FindArea()
    {
        double area = base*height* 0.5;
        return area;

    }

    double FindHypotenuse()
    {
        hypotenuse = Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
        return hypotenuse;

    }
    double FindPerimeter(){

        double length = base+height+hypotenuse;
        return length;

    }

}
class TriangleDemo{
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.height=4.0;
        obj.base = 3.0;

        System.out.println("Area of the triangle is :"+obj.FindArea());
        System.out.println("Hypotenuse of the traingle is :"+obj.FindHypotenuse());
        System.out.println("Perimeter of the traingle is :"+ obj.FindPerimeter());
    }

}
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
        hypotenuse = Math.sqrt(Math.pow(base,2)+Math.pow(height,2)); // no need to make a local variable for hypo
        //tenuse because we have already declared an instance variable inside class Triangle.
        return hypotenuse;

    }
    double FindPerimeter(){

        double length = base+height+hypotenuse;
        return length;

    }

}
class TriangleDemo{
    public static void main(String[] args) {
        Triangle obj = new Triangle(); //Making an instance of traingle class inside the TriangleDemo class
        obj.height=4.0; //adding values for states int he triangle class
        obj.base = 3.0;

        //Calling methods in the triangle class
        System.out.println("Area of the triangle is :"+obj.FindArea());
        System.out.println("Hypotenuse of the triangle is :"+obj.FindHypotenuse());
        System.out.println("Perimeter of the triangle is :"+ obj.FindPerimeter());
    }

}
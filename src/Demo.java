class Calculator {


    double number1;

    double number2;

    double Addition(){
        double add = number1+number2;
        return add;
    }

    double Substraction(){
        double sub = number1-number2;
        return sub;
    }

    double Multiplication(){
        double mult= number1*number2;
        return mult;
    }

    double Divsion(){
        double div = number1/number2;
        return div;
    }

    double Modulus(){

        double mod = number1%number2;
        return  mod;
    }

}

public class Demo{

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.number1 = 12;
        cal.number2 = 5;

        System.out.println("adding:"+cal.Addition());
        System.out.println("substracting:"+ cal.Substraction());
        System.out.println("multiplication"+cal.Multiplication());
        System.out.println("division"+cal.Divsion());
        System.out.println("modulous :"+cal.Modulus());
    }

}


public class FindAverage {
    public static void main(String[] args) {
        var x= 10;
        var y = 5;
        var z = 15;
        FindAverage f ;
        f = new FindAverage();
       double av= f.calAvg(x,y,z);
        System.out.println("Average is:"+ av);


    }
    double calAvg(double a ,double b , double c){
        double avg =(a+b+c)/3;
        return  avg;
    }
}


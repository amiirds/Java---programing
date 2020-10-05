package equations;

public class solv {
    public double j(double a, double b, double c, double d, double e, double f){
        double x = ((e * d) - (b * f)) /((a * d) - (b * c));
        double y = ((a * f) - (e * c)) /((a * d) - (b * c));
        System.out.println(x);
        System.out.println(y);

        return x;

    }
}

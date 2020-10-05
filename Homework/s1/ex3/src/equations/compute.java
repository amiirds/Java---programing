package equations;

public class compute {
    public double k (double a , double b, double d, double c ) {
        double h = (a * d - b * c);
        if (h == 0){
            System.out.println("It's Insoluble");
        }
        else {
            System.out.println("It's solvable");
        }
        return h;
        }
    }


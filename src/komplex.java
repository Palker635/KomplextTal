public class komplex {
    private double a;
    private double b;

    public komplex(double a, double b) {
        this.a = a;
        this.b = b;


    }

    public static void main(String[] args) {
        komplex a = new komplex(3, 2);
        komplex b = new komplex(4, 1);
        komplex c = a.add(b);
        komplex d = a.multiply(b);

        System.out.println(c);
    }

    private static komplex add(komplex a, komplex b) {
            komplex c = new komplex();
        return c;
    }

    private static komplex multiply(komplex a, komplex b) {
            komplex d = new komplex();
        return d;
    }










    public String toString() {
        return Re + " + " + Im + "i";

    }
    private double getIm

}

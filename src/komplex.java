public class komplex {
    private double a;
    private double b;

    public komplex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public komplex(komplex add) {
    }

    public static void main(String[] args) {
        komplex a = new komplex(3, 2);
        komplex b = new komplex(4, 1);

        komplex c = add(a, b);
        komplex d = multiply(a, b);


        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("Add funkar");
        }

        c = multiply(a, b);
        d = new komplex(10,11);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("Multiply funkar");
        }

    }

    private static komplex add(komplex a, komplex b) {
        komplex c = new komplex(add(a, b));
        System.out.println(c);
        return null;
    }

    private static komplex multiply(komplex a, komplex b) {
        komplex d = new komplex(multiply(a, b));
        System.out.println(d);
        return null;
    }
}

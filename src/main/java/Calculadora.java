public class Calculadora {
    public double soma(double a, double b) {
        return a + b;
    }

    public double multiplica(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double subtrai(double a, double b) {
        return a - b;
    }

    public double raizQuadrada(double valor) {
        return Math.sqrt(valor);
    }

    public double exponenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double bhaskara(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        double raizDelta = Math.sqrt(delta);
        double x1 = (-b + raizDelta) / (2 * a);
        double x2 = (-b - raizDelta) / (2 * a);

        return x1 + x2;
    }
}
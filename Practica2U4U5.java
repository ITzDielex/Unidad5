
package practica2u4u5;

public class Practica2U4U5 {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 6;

        System.out.println("Suma: " + suma(num1, num2));
        System.out.println("Resta: " + resta(num1, num2));
        System.out.println("Multiplicacion: " + multiplicacion(num1, num2));

        double resultadoDivision = division(num1, num2);
        if (!Double.isNaN(resultadoDivision)) {
            System.out.println("Division: " + resultadoDivision);
        } else {
            System.out.println("No se puede dividir por cero");
        }
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            return Double.NaN;
        }
    }
}


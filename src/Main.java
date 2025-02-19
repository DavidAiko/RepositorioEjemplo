import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora para el Proyecto Ejemplo");

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Suma
        double suma = num1 + num2;
        System.out.println("La suma es: " + suma);

        // Resta
        double resta = num1 - num2;
        System.out.println("La resta es: " + resta);

        scanner.close();
    }
}
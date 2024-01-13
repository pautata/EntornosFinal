package entornospack;

import java.util.Scanner;

public class Cubo {

	 public static double calcularVolumenCubo(double lado) {
	        return Math.pow(lado, 3);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la longitud del lado del cubo: ");
	        double lado = scanner.nextDouble();

	        // Llamamos al método estático para calcular el volumen del cubo
	        double volumen = calcularVolumenCubo(lado);

	        System.out.println("El volumen del cubo es: " + volumen);
	    }
	}
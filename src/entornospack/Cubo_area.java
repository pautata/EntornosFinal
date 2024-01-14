package entornospack;

import java.util.Scanner;

public class Cubo_area {
	  
	    public static double calcularAreaSuperficial(double lado) {
	        return 6 * Math.pow(lado, 2);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa la longitud de un lado del cubo: ");
	        double lado = scanner.nextDouble();

	       
	        double areaSuperficial = Cubo_area.calcularAreaSuperficial(lado);

	        
	        System.out.println("El área superficial del cubo es: " + areaSuperficial);

	       
	        scanner.close();
	    }
	}


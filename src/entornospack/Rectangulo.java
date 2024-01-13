package entornospack;
import java.util.Scanner;

	public class Rectangulo {
	   
	    public static double calcularArea(double longitud, double anchura) {
	        return longitud * anchura;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa la longitud del rectángulo: ");
	        double longitud = scanner.nextDouble();

	        System.out.print("Ingresa la anchura del rectángulo: ");
	        double anchura = scanner.nextDouble();

	        
	        double area = Rectangulo.calcularArea(longitud, anchura);

	       
	        System.out.println("El área del rectángulo es: " + area);

	      
	        scanner.close();
	    }

	}


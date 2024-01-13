package entornospack;
import java.util.Scanner;

public class Cilindro {

	 public static double calcularAreaBase(double radio) {
	        return Math.PI * Math.pow(radio, 2);
	    }

	    public static double calcularAreaLateral(double radio, double altura) {
	        return 2 * Math.PI * radio * altura;
	    }

	    public static double calcularAreaTotal(double radio, double altura) {
	        double areaBase = calcularAreaBase(radio);
	        double areaLateral = calcularAreaLateral(radio, altura);
	        return 2 * areaBase + areaLateral;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el radio del cilindro: ");
	        double radio = scanner.nextDouble();

	        System.out.print("Ingrese la altura del cilindro: ");
	        double altura = scanner.nextDouble();

	        double areaTotal = calcularAreaTotal(radio, altura);

	        System.out.println("El área total del cilindro es: " + areaTotal);
	    }
	}
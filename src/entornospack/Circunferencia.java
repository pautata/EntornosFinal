package entornospack;

	import java.util.Scanner;

	public class Circunferencia {

	    private static final double PI = 3.14159265359;


	    public double calcularArea(double radio) {
	        return PI * Math.pow(radio, 2);
	    }

	
	    public double calcularPerimetro(double radio) {
	        return 2 * PI * radio;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa el radio de la circunferencia: ");
	        double radio = scanner.nextDouble();

	        // Crear una instancia de la clase Circunferencia
	        Circunferencia circunferencia = new Circunferencia();

	
	        double area = circunferencia.calcularArea(radio);
	        double perimetro = circunferencia.calcularPerimetro(radio);

	       
	        System.out.println("Área de la circunferencia: " + area);
	        System.out.println("Perímetro de la circunferencia: " + perimetro);
	        
	       
	        scanner.close();
	    }
	}


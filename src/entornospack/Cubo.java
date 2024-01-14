package entornospack;
import java.util.Scanner;
public class Cubo {

   
    public static double calcularVolumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    public static double calcularAreaCubo(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cubo: ");
        double lado = scanner.nextDouble();


        double volumen = calcularVolumenCubo(lado);
        System.out.println("El volumen del cubo es: " + volumen);

        
        double area = calcularAreaCubo(lado);
        System.out.println("El área del cubo es: " + area);
        
        scanner.close();
    }
}

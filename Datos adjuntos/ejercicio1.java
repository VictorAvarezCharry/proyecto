import java.util.Scanner;
public class ejercicio1 {
    static double tiempo;
    static double velocidad;
    static double distancia;
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la velocidad constante (m/s): ");
        velocidad = teclado.nextDouble();

        System.out.print("Ingrese el tiempo (segundos): ");
        tiempo = teclado.nextDouble();
        
        calcularDistancia();


        System.out.println("La distancia recorrida es: " + distancia + " metros");

        teclado.close();
    }

    public static void calcularDistancia() {
        distancia = velocidad * tiempo;
    }
}

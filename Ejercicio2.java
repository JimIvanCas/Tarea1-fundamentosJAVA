import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = (numero1 + numero2);

        System.out.print("La suma de los números es: "+ suma);
    }
}
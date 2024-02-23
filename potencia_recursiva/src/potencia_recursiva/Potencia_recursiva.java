import java.util.Scanner;

public class Potencia_recursiva {
    
    // Método recursivo para calcular la potencia
    public static int Potencia_recursiva(int base, int exponente) {
        // Caso base: si el exponente es 0, retorna 1
        if (exponente == 0) {
            return 1;
        } else {
            // Caso recursivo: retorna la multiplicación de la base por la potencia recursiva con un exponente decrementado
            return base * Potencia_recursiva(base, exponente - 1);
        }
    }
  
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base
        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        // Solicitar al usuario que ingrese el exponente
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        // Calcular la potencia llamando al método recursivo
        int resultado = Potencia_recursiva(base, exponente);

        // Mostrar el resultado al usuario
        System.out.println(base + "^" + exponente + " = " + resultado);   
    }  
}

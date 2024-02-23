
package potenciasinmultiplicacion;


public class PotenciaSinMultiplicacion {
    
 public static int potenciaSinMultiplicacion(int base, int exponente) {
        if (exponente == 0) {
            return 1;  // Cualquier número elevado a 0 es 1
        } else if (exponente == 1) {
            return base;  // Cualquier número elevado a 1 es el mismo número
        } else {
            int mitad = potenciaSinMultiplicacion(base, exponente / 2); // Llamada recursiva para calcular la mitad de la potencia
            if (exponente % 2 == 0) {
                return mitad * mitad; // Si el exponente es par, el resultado es el cuadrado de la mitad de la potencia
            } else {
                return base * mitad * mitad; // Si el exponente es impar, se multiplica la base por el cuadrado de la mitad de la potencia
            }
        }
    }

    public static void main(String[] args) {
        int base = 5; // Por ejemplo, base es 5
        int exponente = 3; // Por ejemplo, exponente es 3
        int resultado = potenciaSinMultiplicacion(base, exponente);
        System.out.println(base + "^" + exponente + " = " + resultado); // Debe imprimir 5^3 = 125
    }
}
import java.util.Scanner;

public class EjemploVariables6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");

        int numeroReal = entrada.nextInt();

        System.out.println("Nuestro numero es: " + numeroReal);
        String numeroBinario =  Integer.toBinaryString(numeroReal);
        System.out.println("Numero en Binario: " + numeroBinario);
        System.out.println("Numero en Hexadecimal: " + Integer.toHexString(numeroReal));
        System.out.println("Numero en Octal: " + Integer.toOctalString(numeroReal));
        String resultados = "Nuestro numero es: " + numeroReal + "\nNumero en hexadecimal: " + Integer.toHexString(numeroReal) + "\nNumero en binario: " + Integer.toBinaryString(numeroReal) + "\nNumero en octal: " + Integer.toOctalString(numeroReal);

    }
}

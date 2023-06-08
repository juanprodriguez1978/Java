public class EjemploVariables4 {
    public static void main(String[] args) {
        int numero = 450;
        System.out.println("Nuestro numero es: " + numero);
        String numeroBinario =  Integer.toBinaryString(numero);
        System.out.println("Numero en Binario: " + numeroBinario);
        System.out.println("Numero en Binario escrito en JAVA: " +0b111000010);
        System.out.println("Numero en Hexadecimal: " + Integer.toHexString(numero));
        System.out.println("Numero en Hexadecimal escrito en JAVA: " +0x1c2);
        System.out.println("Numero en Octal: " + Integer.toOctalString(numero));
        System.out.println("Numero en Octal escrito en JAVA: " + 0702);
    }
}

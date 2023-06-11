public class EjemploVariables7 {
    public static void main(String[] args) {
        String booleano = "true";
        boolean booleanoConvertido = Boolean.parseBoolean(booleano);
        System.out.println(booleanoConvertido);

        String decimales = " 2.56";
        double decimalesConvertidos = Double.parseDouble(decimales);
        System.out.println(decimalesConvertidos);

        String entero = "395";
        int enteroConvertido = Integer.parseInt(entero);
        System.out.println(enteroConvertido);

        String flotante = "2.56e2f";
        float flotanteConvertido = Float.parseFloat(flotante);
        System.out.println(flotanteConvertido);
    }
}

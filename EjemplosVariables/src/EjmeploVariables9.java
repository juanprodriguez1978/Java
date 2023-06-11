public class EjmeploVariables9 {
    public static void main(String[] args) {
        String Hola = "Hola, gracias por la informacion";
        String Hola3 = "Hola, gracias por la informacion";
        String Hola1 = new String("Hola, gracias por la informacion");
        System.out.println(Hola);
        System.out.println(Hola1);
        System.out.println(Hola == Hola1); // False, los analizo por la asignacion
        System.out.println(Hola.equals(Hola1)); // True, los analizo por el contenido
        System.out.println("*******************");
        String Saludo = "Hola, gracias por la informacion";
        String Nombre = "Pedro";
        String SaludoPersonalizado = Saludo + "querido "+ Nombre;
        System.out.println(SaludoPersonalizado);
        String SaludoPersonalizado2 = Saludo.concat("querido ").concat(Nombre);
        System.out.println(SaludoPersonalizado2);










    }
}

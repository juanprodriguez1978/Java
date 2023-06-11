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
        String Nombre1 = "Abraham";
        String SaludoPersonalizado = Saludo + " querido "+ Nombre;
        System.out.println(SaludoPersonalizado);
        String SaludoPersonalizado2 = Saludo.concat(" querido ").concat(Nombre);
        System.out.println(SaludoPersonalizado2);

        //Transformamos el Saludo inicial, agregadole apreciado y el Nombre
        Saludo = Saludo.transform(s -> {
            return s + " apreciado " + Nombre;
        });
        System.out.println(Saludo);

        //Para cambiar letras
        Nombre1 = Nombre1.replace("a", "A");
        System.out.println(Nombre1);
        System.out.println("*******************");











    }
}

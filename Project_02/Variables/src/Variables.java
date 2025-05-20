public class Variables {
    public static void main(String[] args) {
        //Variables primitivas
        int numero1 = 10;
        double  numero2 = 3.14;//Puede requerir colocar D o d al final del numero
        float numero3;
        numero3 = 3.1416F;//Requiere letra F o f al final del numero
        char caracter1 = 'A',caracter2 = 65;
        boolean opcion = true;
        long numero4 = 43224224L;//Puede requerir L o l al final del numero
        byte numero5 = 126;
        short numero6 = 128;
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero6);
        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(opcion);
        //Variables de referencia
        String mensaje1, mensaje2;
        mensaje1 = "Esto es un mensaje";
        mensaje2 = """
                Este
                es
                un mensaje
                multilinea
                """;
        System.out.println(mensaje2);
        System.out.println(mensaje1 +" "+ numero1);
        String numero1_string=Integer.toString(numero1);
        System.out.println(mensaje1.concat(numero1_string));

        //Variable general
        var variable1=15;
        var variable2='f';
        System.out.println(variable1);
        System.out.println(variable2);

        //declarar variable constante
        final var PI = 3.1415;
        System.out.println(PI);
        System.out.println("Hola");
    }
}

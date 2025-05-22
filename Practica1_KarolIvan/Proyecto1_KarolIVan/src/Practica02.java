class Refresco{
    //Atributos
    private String sabor;
    private String tamano;
    private double precio;
    private String marca;
    private String nombre;
}
//Métodos
public void asignarSabor(String sabor) {
    if(sabor.length() == 0) {
        System.out.println("Error: Cadena vacia");
        return;
    }
}
public void asignarTamano(String tamano) {
    if (tamano.length() == 0) {
        System.out.println("Error: Cadena vacia");
        return;
    }
}
public void asignarPrecio(double precio) {
    if (precio <= 0) {
        System.out.println("Error: Precio no valido");
        return;
    }
}
public void asignarMarca(String marca) {
    if(marca.length() == 0) {
        System.out.println("Error: Cadena vacia");
        return;
    }
}
public void asignarNombre(String nombre) {
    if (nombre.length() == 0) {
        System.out.println("Error: Cadena vacia");
        return;
    }
}
public class Practica02 {
    public static void main(String[] args) {
    }
}
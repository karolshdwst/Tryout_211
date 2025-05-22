public class MiPerro {
    //Atributos de mi objeto
    private color;
    private tamano;
    private fuerza;
    //Métodos
    public void asignarNombre(String ladrar){
        if(ladrar.length() == 0){
            System.out.println("Error: Cadena vacia");
            return ;
        }
        nombre = ladrar;
    }
    public void asignarNombre(String caminar){
        if(caminar.length() == 0){
            System.out.println("Error: Cadena vacia");
            return ;
        }
        nombre = caminar;
    }
    public static void main(String[] args){
        MiPerro() = new MiPerro01()
        MiPerro01() = asignarColor("Café claro");
        MiPerro01() = asignarTamano("Grande");
        MiPerro01() = asignarFuerza("Fuerte");
        System.out.println(MiPerro01.obtenerColor());
        System.out.println(MiPerro01.obtenerTamano());
        System.out.println(MiPerro01.obtenerFuerza());

    }
}


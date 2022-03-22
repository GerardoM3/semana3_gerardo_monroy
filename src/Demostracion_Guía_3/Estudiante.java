
package Demostracion_Guía_3;

public class Estudiante extends Notas{
    /*ELEMENTOS MIEMBROD DE UNA CLASE*/
    //Atributos, características, campos, variables, datos.
    //Constructores.
    //Métodos.
    int carnet;
    String nombres;
    String apellidos;
    int edad;
    
    public Estudiante(){
        
    }
    
    public Estudiante(String nombres, String apellidos){
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String info_studiante(){
        String name = "";
        name = this.nombres + " " + this.apellidos;
        return name;
    }
    
    public String info_studiante(String a, String b){
        String name = "";
        name = a + " " + b;
        return name;
    }
    
    public String info_studiante(Estudiante objeto){
        String name = "***********************\n";
        name += objeto.getNombres() + " " + objeto.getApellidos() + "\n";
        name += "***********************\n";
        return name;
    }
    
    public String informacion(){
        String name = "";
        name += "El carnet del estudiante es: " + this.carnet + "\n";
        name += "El nombre del estudiante es: " + this.nombres + "\n";
        name += "El apellido del estudiante es: " + this.apellidos + "\n";
        name += "La edad del estudiante es: " + this.edad + "\n";
        return name;
    }
}

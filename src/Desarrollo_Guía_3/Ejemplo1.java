
package Desarrollo_Guía_3;

public class Ejemplo1 {
    long carnet;
    String nombre, apellido;
    
    public void registroEstudiante(){
        System.out.println("Método para registro de estudiante:");
    }
    
    public void consultarEstudiante(){
        System.out.println("Método para consultar de estudiante:");
    }
    
    public void eliminarEstudiante(){
        System.out.println("Método para eliminar de estudiante:");
    }
    
    public static void main(String[] args) {
        Ejemplo1 estudiante = new Ejemplo1();
        estudiante.carnet = 1234; // El objeto estudiante es la instancia de la clase Ejemplo1
        estudiante.nombre = "Amelia";
        estudiante.apellido = "Rosales";
        
        estudiante.registroEstudiante();
        estudiante.consultarEstudiante();
        estudiante.eliminarEstudiante();
        
        System.out.println("Carnet   : " + estudiante.carnet);
        System.out.println("Nombre   : " + estudiante.nombre);
        System.out.println("Apellidos: " + estudiante.apellido);
    }
}

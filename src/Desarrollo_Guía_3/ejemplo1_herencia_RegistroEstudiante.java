
package Desarrollo_Guía_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo1_herencia_RegistroEstudiante {
    public static void main(String[] args) {
        ejemplo1_herencias_estudiante estudiante = new ejemplo1_herencias_estudiante();
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Canet del estudiante:");
            long carnet = Long.parseLong(leer.readLine());
            System.out.println("Nombres del estudiante:");
            String nombres = leer.readLine();
            System.out.println("Apellidos del estudiante:");
            String apellidos = leer.readLine();
            
            //Asignando lo valores a cada atrinuto
            estudiante.setCarnetEstudiante(carnet);
            estudiante.setNombresEstudiante(nombres);
            estudiante.setApellidosEstudiante(apellidos);
            
            //Recuperación de datos
            System.out.println("<<<Recuperando valores>>>");
            System.out.println("Carnet: " + estudiante.getCarnetEstudiante());
            System.out.println("Nombres: " + estudiante.getNombresEstudiante());
            System.out.println("Apellidos: " + estudiante.getApellidosEstudiante());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

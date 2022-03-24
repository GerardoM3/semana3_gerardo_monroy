
package Demostracion_Guía_3;

import java.util.Scanner;

public class RDemostracion {
    public static void main(String[] args) {
        String nombres = "";
        Estudiante objeto = new Estudiante();
        //Notas objeto1 = new Notas();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el carnet: ");
        objeto.setCarnet(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite el nombre: ");
        objeto.setNombres(leer.nextLine());
        System.out.println("Digite el apellido: ");
        objeto.setApellidos(leer.nextLine());
        System.out.println("Digite la edad: ");
        objeto.setEdad(leer.nextInt());
        System.out.println("Digite la nota 1: ");
        objeto.setNota1(leer.nextDouble());
        System.out.println("Digite la nota 2: ");
        objeto.setNota2(leer.nextDouble());
        System.out.println("Digite la nota 3: ");
        objeto.setNota3(leer.nextDouble());
        System.out.println("Digite la nota 4: ");
        objeto.setNota4(leer.nextDouble());
        
        //System.out.println("El nombre del estudiante es: " + objeto.info_studiante());
        //nombres = objeto.info_studiante(objeto.getNombres(), objeto.getApellidos());
        //System.out.println("Nombre es: " + nombres);
        //nombres = objeto.info_studiante(objeto);
        
        nombres = objeto.informacion();
        System.out.println("" + nombres);
        System.out.println("La nota final es: " + objeto.promedio());
        System.out.println("Observación: " + objeto.observacion(objeto));
    }
}

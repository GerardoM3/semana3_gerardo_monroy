
package Ejercicios_Guía_3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ejercicio3_polimorfismo_FormatoFecha {
    
    public void FormatoFecha(int dia, int mes, int año){
        String resultado = String.valueOf(dia + "/" +mes + "/" + año);
        System.out.println(resultado);
        
    }
    public String FormatoFecha(String dia, String mes, String año){
        
        String resultado = String.valueOf(dia + "-" + mes + "-" + año);
        return resultado;
    }
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ejercicio3_polimorfismo_FormatoFecha formatoFecha = new ejercicio3_polimorfismo_FormatoFecha();
        
        System.out.println("Número -> 10062012");
        formatoFecha.FormatoFecha(10,06,2012);
        System.out.println(formatoFecha.FormatoFecha("10", "06", "2012"));
    }
}

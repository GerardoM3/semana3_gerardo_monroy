
package Desarrollo_Guía_3;

import java.util.Scanner;


public class TransaccionesBancarias_Ejem2 {
    public static void main(String[] args) {
        
        CuentaBancaria_Ejem2 cuenta = new CuentaBancaria_Ejem2(); //Crear instancia(objeto) de la clase CuentaBancaria
        Scanner leer = new Scanner(System.in); //objeto leer de la clase Scanner para ingreso de datos desde teclado
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        double abono, retiro;
        System.out.println("Ingresar los datos que se solicitan a continuación:");
        System.out.println("Nombre del propietario:");
        nombreCliente = leer.nextLine(); // Asignar valores a los atributos de la clase
        
        System.out.println("Número de DUI:");
        duiCliente = leer.nextLine(); // Asignar valores a los atributos de la clase
        
        System.out.println("Teléfono:");
        telefonoCliente = leer.nextLong(); // Asignar valores a los atributos de la clase
        
        Cliente_Ejem2 propietario = new Cliente_Ejem2(duiCliente, nombreCliente, telefonoCliente); //Crea el objeto propietario
        
        cuenta.propietarioCuenta = propietario; // Asignamos el objeto propietario al objeto cuenta
        
        System.out.println("Ingrese la cantidad a abonar:");
        cuenta.abonar(abono = leer.nextDouble()); //Envío de parámetro al método abonar de la clase CuentaBancaria_Ejem2
        
        System.out.println("Ingrese cantidad a retirar:");
        cuenta.retirar(retiro = leer.nextDouble());
        
        System.out.println("---------------------------");
        System.out.println("Su saldo de la cuenta es:" + cuenta.saldoCuenta); //Obtiene saldo de cuenta
        //Obtener información del propietario
        System.out.println("Datos del propietario: \n" + cuenta.datosPropietarioCuenta());
    }
}

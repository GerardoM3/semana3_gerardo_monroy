
package Desarrollo_Guía_3;

public class CuentaBancaria_Ejem2 {
    long numeroCuenta;
    Cliente_Ejem2 propietarioCuenta; //Atributo propietarioCuenta del tipo de la clase Cliente
    double saldoCuenta;
    
    public void abonar(double cantidad){
        saldoCuenta += cantidad; //lógica de negocio
    }
    
    public void retirar(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("¡Saldo insuficiente!");
        }
        saldoCuenta -= cantidad; //lógica de negocio
    }
    
    public String datosPropietarioCuenta(){ //Método para retorno de los datos
        String informacion = "";
        informacion += "DUI: " + propietarioCuenta.duiCliente + "\n";
        informacion += "Nombre: " + propietarioCuenta.nombreCliente + "\n";
        informacion += "Teléfono: " + propietarioCuenta.telefonoCliente + "\n";
        return informacion;
    }
}

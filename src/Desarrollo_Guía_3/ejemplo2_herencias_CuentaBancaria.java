
package Desarrollo_Guía_3;

public class ejemplo2_herencias_CuentaBancaria extends ejemplo2_herencias_ClienteBanco{
    private long numCuenta;
    private double cargoCuenta;
    private double abonoCuenta;
    private double saldoCuenta;
    private char estadoCuenta;

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCargoCuenta() {
        return cargoCuenta;
    }

    public void setCargoCuenta(double cargoCuenta) {
        this.cargoCuenta = cargoCuenta;
    }

    public double getAbonoCuenta() {
        return abonoCuenta;
    }

    public void setAbonoCuenta(double abonoCuenta) {
        this.abonoCuenta = abonoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta() {
        this.saldoCuenta = saldoCuenta + this.abonoCuenta - this.cargoCuenta;
    }

    public char getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(char estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
    
    
}

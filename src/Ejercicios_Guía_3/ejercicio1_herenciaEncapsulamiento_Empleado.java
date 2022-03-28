
package Ejercicios_Guía_3;

public class ejercicio1_herenciaEncapsulamiento_Empleado {
    private Long nit;
    private String nombres;
    private String apellidos;
    private String direccion;
    private double salario_devengado;
    private double salario_descuento;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario_devengado() {
        return salario_devengado;
    }

    public void setSalario_devengado(double salario_devengado) {
        this.salario_devengado = salario_devengado;
    }

    public double getSalario_descuento() {
        this.salario_descuento = 0.1;
        return salario_descuento;
    }


    
    public double SalarioConDescuento(double salario_devengado){
        double resultado = 0.0;
        resultado = salario_devengado - (salario_devengado * this.getSalario_descuento());
        return resultado;
    }
    
    
    public String informacionContribuyente(){
        String resultado = "";
        resultado = "\nNombre completo del contribuyente: " + this.getNombres() + " " + this.getApellidos();
        resultado += "\nN° de NIT: " + this.getNit();
        resultado += "\nDirección: " + this.getDireccion();
        resultado += "\nEl salario devengado: $" + this.getSalario_devengado();
        resultado += "\nSalario con descuento de la renta aplicada: $" + this.SalarioConDescuento(this.getSalario_devengado());
        resultado += "\nEstado de empleado: " + this.getEstado();
        return resultado;
    }
}

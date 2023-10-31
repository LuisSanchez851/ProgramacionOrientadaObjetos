
package co.edu.uniempresarial.entidades;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String documento;
    private double ingresoMensual;
    private int edad;

    public Cliente(String nombres, String apellidos, String documento, double ingresoMensual, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.ingresoMensual = ingresoMensual;
        this.edad = edad;
    }

    public Cliente(double ingresoMensual, int edad) {
        this.ingresoMensual = ingresoMensual;
        this.edad = edad;
    }
    //Metodos de acceso get y set

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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String clasificarCliente(){
        double salarioMinimo=500; //Variables de ambito local 
        String mensaje="";
        if((this.edad<18) && (this.ingresoMensual<salarioMinimo)){
            mensaje= "CLIENTE NO POTENCIA";
        }else if((this.edad<18) && (this.ingresoMensual>=salarioMinimo)){
           mensaje="CLIENTE BASICO-POTENCIAL"; 
        }else if((this.edad<65) && (this.ingresoMensual<salarioMinimo)){
           mensaje="CLIENTE NO POTENCIAL"; 
        }else {
            mensaje="CLIENTE NO POTENCIAL";
        }
        
        if(this.ingresoMensual> (salarioMinimo*6)){
            mensaje="CLIENTE POTENCIAL";
        
        }
        return mensaje;
    }
}

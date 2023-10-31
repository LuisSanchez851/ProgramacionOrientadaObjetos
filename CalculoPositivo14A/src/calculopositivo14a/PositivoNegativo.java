
package calculopositivo14a;

public class PositivoNegativo {
   private double numero;
   //Consstructor es un Inicializado de atributos
   public PositivoNegativo(double num1){
       this.numero=num1;
       
   }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
   
  //Metodos de orden 
   public void calculoPositivo(/*Recibir argumentos*/){
       if(this.numero>0) System.out.println("Numero positivo");
       else if(this.numero<0) System.out.println("Numero negativo");
   }
}

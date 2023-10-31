package calcularparimpar;


public class ParImpar {
    private double numero; 
    
    public ParImpar(double num1){ //Constructor
        this.numero=num1;
        
    }
        public String calcularParImpar(){
            if(numero%0)
                System.out.println("El numero es par. ");
    }
}

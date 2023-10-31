
package calculopromedio;


public class Promedio {
    private double nota1;
    private double nota2;
    private double nota3;

    public Promedio(double nota1, double nota2, double nota3){
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3; 
    }   
    //get and set
    public double getNota1(){
        return this.nota1;
    }
    public void setNota1(double nota1){
        this.nota1= nota1;
    }
    public double getNota2(){
        return this.nota1;
    }
    public void setNota2(double nota1){
        this.nota1= nota2;
    }
    public double getNota3(){
        return this.nota1;
    }
    public void setNota3(double nota1){
        this.nota1= nota3;
    }
    public double calcularPromedio(){
        return (this.nota1+this.nota2+this.nota3)/3;
    }
    public double calcularNotaBaja(){
        if((this.nota1<this.nota2)&&(this.nota1<this.nota3))
            return(this.nota1);
        else if (this.nota1==this.nota2)
            return this.nota1;
        else if(this.nota1 == this.nota3)
            return this.nota1; 
        else if((this.nota2<this.nota1) && (this.nota2<this.nota3))
            return(this.nota2);
        else if (this.nota2 == this.nota3)
            return(this.nota2);
            
            return this.nota3;
    }
}

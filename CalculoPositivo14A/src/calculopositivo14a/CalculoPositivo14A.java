
package calculopositivo14a;

import java.util.Scanner;

public class CalculoPositivo14A {

    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner read = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num1 = read.nextDouble();
        //Instanciar el objeto de tipo PositivoNegativo
        
        PositivoNegativo PositivoNegativo = new PositivoNegativo(num1);
        System.out.println("El numero es: "+PositivoNegativo.getNumero());
        PositivoNegativo.calculoPositivo();
        
        //Pasar un nuevo parametro Set
        System.out.println("Dame un numero");
        num1= read.nextDouble();
        PositivoNegativo.setNumero(num1);
        System.out.println("El numero es: "+PositivoNegativo.getNumero());
        PositivoNegativo.calculoPositivo();
    }
        
}

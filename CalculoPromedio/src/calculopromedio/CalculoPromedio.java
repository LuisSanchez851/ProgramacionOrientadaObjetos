package calculopromedio;

import java.util.Scanner;


public class CalculoPromedio {


    public static void main(String[] args) {
       //Dado 3 notas de un estudiante calcular el primedio, e imprimir la nota mas baja
        Scanner read = new Scanner(System.in);
        System.out.println("Dame la nota 1: ");
        double nota1 = read.nextDouble();
        System.out.println("Dame la nota 2: ");
        double nota2 = read.nextDouble();
        System.out.println("Dame la nota 3: ");
        double nota3 = read.nextDouble();
        //Instanciar el objeto de tipo Promedio
        Promedio promedio = new Promedio(nota1, nota2, nota3);
        double varPromedio = promedio.calcularPromedio();
        System.out.println("El promedio es: "+varPromedio);
        System.out.println("Nota mas baja es: "+promedio.calcularNotaBaja());

    }
    
}

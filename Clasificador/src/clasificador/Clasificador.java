/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificador;

import co.edu.uniempresarial.entidades.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author uestudiantes
 */
public class Clasificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names =JOptionPane.showInputDialog("Dame el bombre"); 
        String lastNames=JOptionPane.showInputDialog("Dame el apellido");
        String document=JOptionPane.showInputDialog("Dame el documento");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Dame el salario"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Dame la edad"));
    //Instacnciar objeto de tipo cliente o crear objeto 
    Cliente miCliente = new Cliente(names,lastNames, document,salary, age );
        JOptionPane.showMessageDialog(null,""+miCliente.clasificarCliente());
    //instanciar otro objeto y utilizar el segungo constructor
    names="";
    lastNames="";
    document="";
    salary=Double.parseDouble(JOptionPane.showInputDialog("Dame el salario"));
    age=Integer.parseInt(JOptionPane.showInputDialog("Dame la edad"));
    //Instanciamiento de objeto con el 2do constructor
    
    Cliente clienteAnonimo = new Cliente(salary, age);
    JOptionPane.showConfirmDialog(null,""+clienteAnonimo.clasificarCliente());
    
    }
    
}

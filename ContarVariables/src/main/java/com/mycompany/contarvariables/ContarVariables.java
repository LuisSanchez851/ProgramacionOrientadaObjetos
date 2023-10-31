package com.mycompany.contarvariables;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ContarVariables {

    // Estas son variables primitivas
    private final int entero = 2;
    private final float decimal = 200;
    private final byte ochoBits = 127;

    // Estas son variables definidas
    private final String cadena = "Cadena";
    private final List<Integer> listaEnteros = new ArrayList<>();
    //private final ContarVariables objetoPersonalizado = this;

    public static void main(String[] args) {
     
        int contador = 0;
        Class<?> claseActual = ContarVariables.class;
        // Obtén todos los campos (variables) de la clase actual
        Field[] campos = claseActual.getDeclaredFields();
        // Lista para almacenar variables definidas (tipo de referencia)
        List<Field> variablesDefinidas = new ArrayList<>();
        // Itera sobre los campos y verifica si son de tipo de referencia
        for (Field campo : campos) {
            if (!campo.getType().isPrimitive()) {
                // El campo no es primitivo, es una variable definida
                contador++;
                variablesDefinidas.add(campo);
            }
        }
        if (contador == 0) {
            // Este System.out.println sirve para imprimir cuantas variables definidas existen
            System.out.println("No existen variables definidas en este archivo");
        } else if (contador == 1) {
            // Este System.out.println sirve para imprimir cuantas variables definidas existen
            System.out.println("La variable definida es: ");
        } else {
            // Este System.out.println sirve para imprimir cuantas variables definidas existen
            System.out.println("La cantidad de variables definidas que existen en este archivo son: " + contador);
        }
        for (Field variable : variablesDefinidas) {
            System.out.println(variable.getName() + " - Tipo: " +
                    variable.getType().getName());
        }
    }
}


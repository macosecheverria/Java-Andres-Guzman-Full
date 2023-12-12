package org.aguzman.pooexcepciones.ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        //String valor = JOptionPane.showInputDialog("Ingrese un entero");
        //int divisor;
        //double division;
        String numerador = JOptionPane.showInputDialog("Ingrese el numerador");
        String divisor  =  JOptionPane.showInputDialog("Ingrese el divisior");
        

        try {
            //divisor = Integer.parseInt(valor);
            //division = calculadora.dividir(10, divisor);
            //System.out.println(division);

            double division2 = calculadora.dividir(numerador, divisor);
            System.out.println(division2);
        } catch (DivisionPorCeroException e) {
            System.out.println(e.getMessage());
            main(args);
        }catch(FormatoNumeroException e){
            System.out.println("Ingrese un numero valido"+ e.getMessage());
            e.printStackTrace(System.out);
        } 
    }
}

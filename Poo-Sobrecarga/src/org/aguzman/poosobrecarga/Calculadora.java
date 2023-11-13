package org.aguzman.poosobrecarga;

public class Calculadora {

    private Calculadora(){
    }

    public static int sumar(int ...varargs){
        int total = 0;

        for(int i: varargs){
            total += i;
        }

        return total;
    }

    public static float sumar(float a, int ...varargs){
        float total = 0;

        for(int i: varargs){
            total += i;
        }

        return total;
    }

    public static double sumar(double ...varargs){
        double total = 0.0f;

        for(double i: varargs){
            total += i;
        }

        return total;
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static float sumar(float a, float b){
        return a + b;
    }

    public static float sumar(int a, float b){
        return a + b ;
    }

    public static float sumar(float a, int b){
        return a + b;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a , String b){
        int resultado;

        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado = 0;
            System.err.println("Error debe de ser un numero" + e.getMessage());
        }

        return resultado;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

}

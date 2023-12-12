package org.aguzman.pooexcepciones.ejemplo;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DivisionPorCeroException {
        if (divisor == 0) {
            throw new DivisionPorCeroException("Error no se puede dividir por cero");
        }

        return numerador / (double) divisor;
    }

    public double dividir(String numerador, String divisor) throws DivisionPorCeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);

            return this.dividir(num, div);
        } catch (NumberFormatException e) {
            throw new FormatoNumeroException("Debe ingresar un numero en el numerador y divisor");
        }

    }
}

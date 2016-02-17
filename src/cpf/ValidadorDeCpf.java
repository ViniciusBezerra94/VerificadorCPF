/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cpf;

/**
 * Classe que serve para validar CPF.
 * @author Bruno Bezerra Lima - 
 *         Vinicius Bezerra Lima - 
 */
public class ValidadorDeCpf {

    public boolean validarPrimeiroVerificador(String cpf) {
        boolean verificaCpf = false;
        int validador = 0;
        int soma = 0;
        for (int i = 0, j = 10; i < 9; i++, j--) {

            validador = Character.digit(cpf.charAt(i), 10);
            soma = soma + (validador * j);


        }
        int n1 = 0;
        if (soma % 11 < 2) {
            n1 = 0;
        } else {
            n1 = 11 - (soma % 11);
            //cpf = String.valueOf(n1);
        }
        if (n1 == Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
            verificaCpf = true;
        } else {
            return verificaCpf;
        }
        return verificaCpf;
    }

    public boolean validarSegundoValidador(String cpf) {
        boolean verificaCpf = false;
        int validador = 0;
        int soma = 0;
        for (int i = 0, j = 11; i < 10; i++, j--) {

            validador = Character.digit(cpf.charAt(i), 10);
            soma = soma + (validador * j);


        }
        int n1 = 0;
        if (soma % 11 < 2) {
            n1 = 0;
        } else {
            n1 = 11 - (soma % 11);
        }
        if (n1 == Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
            verificaCpf = true;
        } else {
            return verificaCpf;
        }
        return verificaCpf;
    }

    public boolean validadorDeCPF(String cpf) {
        boolean verificaCpf = false;
        int validador = 0;
        int soma = 0;
        for (int i = 0, j = 10; i < 9; i++, j--) {

            validador = Character.digit(cpf.charAt(i), 10);
            soma = soma + (validador * j);


        }
        int n1 = 0;
        if (soma % 11 < 2) {
            n1 = 0;
        } else {
            n1 = 11 - (soma % 11);
            //cpf = String.valueOf(n1);
        }
        if (n1 == Integer.parseInt(String.valueOf(cpf.charAt(9)))) {
            verificaCpf = true;
        } else {
            return verificaCpf;
        }

        soma = 0;
        for (int i = 0, j = 11; i < 10; i++, j--) {

            validador = Character.digit(cpf.charAt(i), 10);
            soma = soma + (validador * j);
        }
        int n2 = 0;
        if (soma % 11 < 2) {
            n2 = 0;
        } else {
            n2 = 11 - (soma % 11);
        }
        if (!(n2 == Integer.parseInt(String.valueOf(cpf.charAt(10))))) {
            verificaCpf = false;
        }

        return verificaCpf;

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cpf;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Classe de teste para testar primeiro e segundo numero verificador, e testar os 2 juntos;
 * @author  
 *          Vinicius Bezerra Lima 
 */        
public class TesteVerificador {

    private ValidadorDeCpf c;

    @Before
    public void inicializar() {
        c = new ValidadorDeCpf();
    }

    @Test
    public void testePrimeiroVerificador() {
        //437.944.348-54 - cpf aleatorio retirado de um gerador
       
        assertEquals(true, c.validarPrimeiroVerificador("43794434854"));
    }

    @Test
    public void testeSegundoVerificador() {
        assertEquals(true, c.validarSegundoValidador("43794434854"));
    }

    @Test
    public void testeCpf() {
        assertEquals(true, c.validadorDeCPF("43794434854"));
        assertEquals(true, c.validadorDeCPF("43794434854"));

    }
}

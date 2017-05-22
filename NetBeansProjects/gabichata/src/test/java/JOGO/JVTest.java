/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOGO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class JVTest {
    
    public JVTest() {
    }

    @Test
    public void testValido() {        
        JV jogo3 = new JV();
        boolean S = jogo3.Valido("5");
        Assert.assertEquals(true,S);     
    }

    @Test
    public void testJogada() {
        JV jogo2 = new JV();
        String S = jogo2.Jogada("10", "x");
        Assert.assertEquals("número inválido",S);
    }

    @Test
    public void testGanhou() { 
        JV jogo1 = new JV();
        String S = jogo1.Ganhou(9);
        Assert.assertEquals("OPS, deu velha ngm",S);
    }
     
    
    
    @Test
    public void testMostrar() {
        JV jogo1 = new JV();
        String s = jogo1.Mostrar();
        Assert.assertEquals("  1  2  3\n" +"  4  5  6\n" +"  7  8  9\n",s);     
    }
}
 
